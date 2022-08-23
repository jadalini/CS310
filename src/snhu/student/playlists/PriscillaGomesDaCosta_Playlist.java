package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

//Create a new playlist with FooFighters and Adele songs
public class PriscillaGomesDaCosta_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> FooFightersTracks = new ArrayList<Song>();
    FooFighters FooFightersBand = new FooFighters();
	
    FooFightersTracks = FooFightersBand.getFooFightersSongs(); 		//Capitalized the "F" in Fighters
	
	playlist.add(FooFightersTracks.get(0));
	playlist.add(FooFightersTracks.get(1));
	
	
    Adele AdeleBand = new Adele();
	ArrayList<Song> AdeleTracks = new ArrayList<Song>();
    AdeleTracks = AdeleBand.getAdelesSongs();					//naming convention was an "s" at the end of Adele to get from music list
	
	playlist.add(AdeleTracks.get(0));
	playlist.add(AdeleTracks.get(1));
	playlist.add(AdeleTracks.get(2));
	
    return playlist;
	}
}
