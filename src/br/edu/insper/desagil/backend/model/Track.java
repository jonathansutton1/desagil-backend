package br.edu.insper.desagil.backend.model;

public class Track {
	private Artist artist;
	private String name;
	private int duration;
	
	public Track(Artist artist, String name, int duration) {
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}
	
	//public String getDurationString() {
		
	//}
	
	
	
	
	
}
