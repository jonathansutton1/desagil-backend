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
		return this.name;
	}

	public int getDuration() {
		return this.duration;
	}
	
	public String getDurationString() {
		double minutesPerSixty = (double) this.duration/60;
		int minutes = (int) minutesPerSixty;
		double dec = minutesPerSixty - minutes;
		int rest = 0;
		
		if (dec > 0.001) {
			rest =(int)dec*60;
		}
		String intStr = Integer.toString(rest);
		String restStr;
		restStr = "0" + Integer.toString(minutes);
		return intStr + ":" + restStr;
		
	}
	
	public String getFullArtistName() {
		return artist.getName();
	}
	
	
	
	
	
}
