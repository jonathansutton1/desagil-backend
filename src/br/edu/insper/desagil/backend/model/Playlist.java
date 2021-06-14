package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {
	private int id;
	private List<Track> tracks;
	private Map<String,Integer> ratings;
	
	public Playlist(int id, List<Track> tracks, Map<String, Integer> ratings) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track track) {
		this.tracks.add(track);
	}
	
	public void putRating(String nome,int avaliacao) {
		this.ratings.put(nome, avaliacao);
		
	}
	
	//public double averageRatings() {
		
	//}
	
	
	

}
