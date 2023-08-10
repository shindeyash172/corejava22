package com.aurionpro.model;

import java.io.Serializable;
import java.util.Scanner;

import com.aurionpro.model.Movie;
import com.aurionpro.model.MovieManager;

public class MovieController implements Serializable {
	private MovieManager manager;

	Scanner sc=new Scanner(System.in);
	 
	public MovieController() {
	        this.manager = new MovieManager();
	    } 
	public void setMovie(Movie movie) {
		this.manager.addMovie(movie);
	}
	
	private void displayMenu() {
        System.out.println("1. Add Movie");
        System.out.println("2. Clear Movies");
        System.out.println("3. Get Movie ID");
        System.out.println("4. Display All movies");
        System.out.println("5.Exit");
    }

	
	
    public void start() {
        displayMenu();
    	Scanner scanner = new Scanner(System.in);
        int choice;
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                     this.manager.addMovie( getValues());
                	break;
                case 2:
                	this.manager.clearMovies(null);
                    break;
                case 3:
                	System.out.println("Enter the name of the movie:");
                	String movieName = scanner.nextLine();
                	int movieId = this.manager.getMovieId(movieName);
                	System.out.println("Movie ID of " + movieName + ": " + movieId);
                	break;
                case 4:
                	this.manager.displayAllMovies();
                    break;
                case 5:
                	displayAllMovies();
                	System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } 
    private Movie getValues() {
    	
    	Scanner  sc=new Scanner(System.in);
    	System.out.println(" Enter movie id ");
    	int id=sc.nextInt();
    	System.out.println(" Enter movie name ");
    	 String name=sc.next();
    	System.out.println(" Enter movie year ");
    	int year=sc.nextInt();
    	System.out.println(" Enter movie  genre ");
    	String genre=sc.next();
    	
    	
    	return new Movie(id,name,year,genre);
    }

    private void displayAllMovies() {
        System.out.println("List of Movies:");
        for (Movie movie : manager.getAllMovies()) {
            System.out.println("Movie Id: " + movie.getId());
            System.out.println("Title: " + movie.getName());
            System.out.println("Release Year: " + movie.getYear());
            System.out.println("Genre: " + movie.getGenre());
     
      }
    }



	




}