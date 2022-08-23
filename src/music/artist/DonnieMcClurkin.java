package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class DonnieMcClurkin {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public DonnieMcClurkin() {
    }
    
    public ArrayList<Song> getDonnieMcClurkinSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   			//Instantiate the album so we can populate it below
    	 Song track1 = new Song("You Are My God And King (Reprise)", "Donnie McClurkin");	//Create a song
         Song track2 = new Song("Stand", "Donnie McClurkin");     							//Create another song
         this.albumTracks.add(track1);                                          			//Add the first song to song list for Donnie McClurkin
         this.albumTracks.add(track2);                                          			//Add the second song to song list for Donnie McClurkin 
         return albumTracks;                                                    			//Return the songs for Donnie McClurkin in the form of an ArrayList
    }
}