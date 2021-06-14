package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.List;

public class CollaborationTrack extends Track {
	private List<Artist> collaborators;

	public CollaborationTrack(Artist artist, String name, int duration, List<Artist> collaborators) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}

	public String getFullArtistName() {
		String fullName = this.getArtist().getName();
		List<String> collaboratorsList = new ArrayList<>();
		for(Artist collaborator:this.collaborators) {
			String collaboratorFullName = collaborator.getName();
			collaboratorsList.add(collaboratorFullName);
		}
		fullName = String.join(", ", collaboratorsList);
		return fullName + " (feat. "+String.join(", ", collaboratorsList)+")";
	}
}
