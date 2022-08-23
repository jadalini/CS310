package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AllanGibbons_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> linkinparkTracks = new ArrayList<Song>();
    LinkinPark linkinParkBand = new LinkinPark();
	
    linkinparkTracks = linkinParkBand.getLinkinParkSongs();
	
	playlist.add(linkinparkTracks.get(0));
	playlist.add(linkinparkTracks.get(1));
	playlist.add(linkinparkTracks.get(2));
	
	
    FiveFingerDeathPunch fiveFingerDeathPunchBand = new FiveFingerDeathPunch();		//added Five Finger Death Punch songs from to my playlist
	ArrayList<Song> fiveFingerDeathPunchTracks = new ArrayList<Song>();
	fiveFingerDeathPunchTracks = fiveFingerDeathPunchBand.getFiveFingerDeathPunchSongs();
	
	playlist.add(fiveFingerDeathPunchTracks.get(0));
	playlist.add(fiveFingerDeathPunchTracks.get(1));
	
	
	FooFighters fooFightersBand = new FooFighters();				//code to grab Foo Fighters Song
	ArrayList<Song> fooFightersTracks = new ArrayList<Song>();
	fooFightersTracks = fooFightersBand.getFooFightersSongs();
	
	playlist.add(fooFightersTracks.get(1));							//added Foo Fighters song from classmates playlist track 2
	
	
    return playlist;
	}
}
