package com.mymovies.dto;

public class Release_DateDTO {

	// Attributs
	
	private String certification;
	
	private String iso_639_1;
	
	private String release_date;
	
	private int type;
	
	private String note;
	
	// Override toString
	
	@Override
	public String toString() {
		return "Release_DateDTO [certification=" + certification + ", iso_639_1=" + iso_639_1 + ", release_date="
				+ release_date + ", type=" + type + ", note=" + note + "]";
	}

	// Constructor From SuperClass
	
	public Release_DateDTO() {
		super();
	}

	// Constructor Using Fields
	
	public Release_DateDTO(String certification, String iso_639_1, String release_date, int type, String note) {
		super();
		this.certification = certification;
		this.iso_639_1 = iso_639_1;
		this.release_date = release_date;
		this.type = type;
		this.note = note;
	}
	
	// Getters and Setters

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getIso_639_1() {
		return iso_639_1;
	}

	public void setIso_639_1(String iso_639_1) {
		this.iso_639_1 = iso_639_1;
	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
