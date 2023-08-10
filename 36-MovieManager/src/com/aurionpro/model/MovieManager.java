package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.aurionpro.model.Movie;

import com.aurionpro.model.Movie;

public class MovieManager implements Serializable {
	private List<Movie> movieList;
	static final String path = "C:\\JAVA WORKSPACE\\corejava\\36-MovieManager\\src\\com\\aurionpro\\test\\Movies.txt";

	public MovieManager() {
		movieList = new ArrayList<>();
		loadMovies();
	}

	private void loadMovies() {
		try {
			FileInputStream fis = new FileInputStream(path);
			int b = fis.available();
			if (b != 0) {
				ObjectInputStream in = new ObjectInputStream(fis);
				movieList = (List<Movie>) in.readObject();
				in.close();
			}
			fis.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}
	}

	public void saveMovies() {
		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(path))) {
			obj.writeObject(this.movieList);
			obj.flush();
			System.out.println("File Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Movie> getAllMovies() {
		return new ArrayList<>(movieList);
	}

	public void addMovie(Movie movie) {
		movieList.add(movie);
		this.saveMovies();
	}

	public void clearMovies(Movie movie) {
		this.movieList.clear();
		this.saveMovies();

	}

	public int getMovieId(String name) {
	    for (Movie movie : movieList) {
	        if (movie.getName().equals(name)) {
	            return movie.getId();
	        }
	    }
	    return -1; 
	}


	public void displayAllMovies() {
		for (Movie movie : movieList) {
			System.out.println(movie);
		}
	}

}
