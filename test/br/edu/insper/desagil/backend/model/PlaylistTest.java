package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;
	private Playlist playlist;

	@BeforeEach
	void setUp() {		
	}

	@Test
	void testRoundDownToZero() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("José",2);
		playlist.putRating("Marcos",3);
		playlist.putRating("Anderson",3);
		double media = playlist.averageRatings();
		assertEquals(2,media,DELTA);
	}

	@Test
	void testRoundUpToHalf() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("José",2);
		playlist.putRating("Marcos",1);
		double media = playlist.averageRatings();
		assertEquals(1.5,media,DELTA);
	}

	@Test
	void testRoundDownToHalf() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("José",2);
		playlist.putRating("Marcos",2);
		double media = playlist.averageRatings();
		assertEquals(1.5,media,DELTA);
		
		
	}

	@Test
	void testRoundUpToOne() {
		playlist.putRating("Jonathan",1);
		playlist.putRating("José",1);
		playlist.putRating("Marcos",2);
		playlist.putRating("Anderson",3);
		double media = playlist.averageRatings();
		assertEquals(2,media,DELTA);
	}
}
