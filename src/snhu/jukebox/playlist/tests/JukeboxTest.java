package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	


	@Test
	public void testGetLanaDelReyAlbumSize() throws NoSuchFieldException, SecurityException {
		LanaDelRey lanaDelRey = new LanaDelRey();
		ArrayList<Song> lanaDelReyTracks = new ArrayList<Song>();
		lanaDelReyTracks = lanaDelRey.getLanaDelReySongs();
		assertEquals(26, lanaDelReyTracks.size());
    }

	
	@Test
	public void testGetLilBabyAlbumSize() throws NoSuchFieldException, SecurityException {
		LilBaby lilBaby = new LilBaby();
		ArrayList<Song> lilBabyTracks = new ArrayList<Song>();
		lilBabyTracks = lilBaby.getLilBabySongs();
		assertEquals(, lilBabyTracks.size(5));
    }

}
