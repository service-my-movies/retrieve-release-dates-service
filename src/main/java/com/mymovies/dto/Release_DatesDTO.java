package com.mymovies.dto;

import java.util.ArrayList;

public class Release_DatesDTO {
	
	// Attributs
	
	private int id;
	
	private ArrayList<ResultsRelease_DatesDTO> results;

	// Override toString
	
	@Override
	public String toString() {
		return "Release_DatesDTO [id=" + id + ", results=" + results + "]";
	}

	// Constructor From SuperClass
	
	public Release_DatesDTO() {
		super();
	}

	// Constructor Using Fields
	
	public Release_DatesDTO(int id, ArrayList<ResultsRelease_DatesDTO> results) {
		super();
		this.id = id;
		this.results = results;
	}

	// Getters and Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<ResultsRelease_DatesDTO> getResults() {
		return results;
	}

	public void setResults(ArrayList<ResultsRelease_DatesDTO> results) {
		this.results = results;
	}

}
