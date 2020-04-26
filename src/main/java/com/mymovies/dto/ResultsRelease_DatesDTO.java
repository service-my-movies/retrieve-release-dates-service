package com.mymovies.dto;

import java.util.ArrayList;

public class ResultsRelease_DatesDTO {
	
	// Attributs
	
	private String iso_3166_1;
	
	private ArrayList<Release_DateDTO> release_dates;

	// Override toString
	
	@Override
	public String toString() {
		return "ResultsRelease_DatesDTO [iso_3166_1=" + iso_3166_1 + ", release_dates=" + release_dates + "]";
	}

	// Constructor From SuperClass
	
	public ResultsRelease_DatesDTO() {
		super();
	}

	// Constructor Using Fields
	
	public ResultsRelease_DatesDTO(String iso_3166_1, ArrayList<Release_DateDTO> release_dates) {
		super();
		this.iso_3166_1 = iso_3166_1;
		this.release_dates = release_dates;
	}
	
	// Getters and Setters

	public String getIso_3166_1() {
		return iso_3166_1;
	}

	public void setIso_3166_1(String iso_3166_1) {
		this.iso_3166_1 = iso_3166_1;
	}

	public ArrayList<Release_DateDTO> getRelease_dates() {
		return release_dates;
	}

	public void setRelease_dates(ArrayList<Release_DateDTO> release_dates) {
		this.release_dates = release_dates;
	}

}
