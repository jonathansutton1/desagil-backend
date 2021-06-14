package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	private Artist Anitta;
	private Artist Alok;
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Track track = new Track(Alok,"Hear me Now",0);
		assertEquals("0:00", track.getDurationString());
	}

	@Test
	void testFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",5);
		assertEquals("0:05",track.getDurationString());
	}

	@Test
	void testTwentyFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",25);
		assertEquals("0:25", track.getDurationString());
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Track track = new Track(Alok,"Hear me Now",60);
		assertEquals("1:20", track.getDurationString());
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",65);
		assertEquals("1:05", track.getDurationString());
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",85);
		assertEquals("1:25", track.getDurationString());
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Track track = new Track(Alok,"Hear me Now",120);
		assertEquals("2:00", track.getDurationString());

	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",125);
		assertEquals("2:05", track.getDurationString());
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Track track = new Track(Alok,"Hear me Now",145);
		assertEquals("2:25", track.getDurationString());

	}

	@Test
	void testOneCollaborator() {
		Artist becky = new Artist("Becky G");
		List<Artist> listCollaborators = new ArrayList<>();
		listCollaborators.add(becky);
		CollaborationTrack collaborators = new CollaborationTrack(Anitta,"banana",120,listCollaborators);
		assertEquals("Anitta (feat. Becky G)", collaborators.getFullArtistName());
	}

	@Test
	void testTwoCollaborators() {
		Artist lud = new Artist("Ludmilla");
		Artist sd = new Artist("Snoop Dog");
		List<Artist> listCollaborators = new ArrayList<>();
		listCollaborators.add(lud);
		listCollaborators.add(sd);
		CollaborationTrack collaborators = new CollaborationTrack(Anitta,"Onda Diferente",120,listCollaborators);
		assertEquals("Anitta (feat.Ludmilla, Snoop Dog)", collaborators.getFullArtistName());
	}
}
