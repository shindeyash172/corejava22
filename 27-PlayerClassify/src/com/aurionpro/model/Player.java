package com.aurionpro.model;

public class Player {
	private int id;
	private String name;
	private int matches;
	private int runs;
	private int wickets;

	public Player(int id, String name, int matches, int runs, int wickets) {
		super();
		this.id = id;
		this.name = name;
		this.matches = matches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + matches;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + runs;
		result = prime * result + wickets;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		if (matches != other.matches)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (runs != other.runs)
			return false;
		if (wickets != other.wickets)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", matches=" + matches + ", runs=" + runs + ", wickets="
				+ wickets + "]";
	}
	
	

}
