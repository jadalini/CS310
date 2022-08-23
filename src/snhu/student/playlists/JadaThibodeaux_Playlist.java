package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class JadaThibodeaux_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> lanaDelReyTracks = new ArrayList<Song>();
    LanaDelRey lanaDelRey = new LanaDelRey();
	
    lanaDelReyTracks = lanaDelRey.getLanaDelReySongs();
	
	playlist.add(lanaDelReyTracks.get(0));
	playlist.add(lanaDelReyTracks.get(1));
	playlist.add(lanaDelReyTracks.get(2));
	playlist.add(lanaDelReyTracks.get(5));
	playlist.add(lanaDelReyTracks.get(4));
	playlist.add(lanaDelReyTracks.get(5));
	playlist.add(lanaDelReyTracks.get(7));
	playlist.add(lanaDelReyTracks.get(8));
	playlist.add(lanaDelReyTracks.get(9));
	playlist.add(lanaDelReyTracks.get(10));
	playlist.add(lanaDelReyTracks.get(11));
	playlist.add(lanaDelReyTracks.get(12));
	playlist.add(lanaDelReyTracks.get(13));
	playlist.add(lanaDelReyTracks.get(19));
	playlist.add(lanaDelReyTracks.get(20));
	playlist.add(lanaDelReyTracks.get(21));
	playlist.add(lanaDelReyTracks.get(22));
	playlist.add(lanaDelReyTracks.get(23));
	playlist.add(lanaDelReyTracks.get(24));
	playlist.add(lanaDelReyTracks.get(25));
	playlist.add(lanaDelReyTracks.get(8));

	ArrayList<Song> lilBabyTracks = new ArrayList<Song>();
    LilBaby lilBaby = new LilBaby();
	
    lilBabyTracks = lilBaby.getLilBabySongs();
	
	playlist.add(lilBabyTracks.get(0));
	playlist.add(lilBabyTracks.get(1));
	playlist.add(lilBabyTracks.get(2));
	playlist.add(lilBabyTracks.get(5));
	playlist.add(lilBabyTracks.get(4));
	
	
	
	ImagineDragons imagineDragonsBand = new ImagineDragons();
	ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
	imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
		
	playlist.add(imagineDragonsTracks.get(0));
	playlist.add(imagineDragonsTracks.get(1));
	playlist.add(imagineDragonsTracks.get(2));
		
	return playlist;
	}
}
