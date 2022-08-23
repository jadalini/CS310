package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class RayCharles {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public RayCharles() {
    }
    
    public ArrayList<Song> getRayCharlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   			//Instantiate the album so we can populate it below
    	 Song track1 = new Song("Georgia On My Mind", "Ray Charles");						//Create a song
         Song track2 = new Song("Take These Chains From My Heart", "Ray Charles");         	//Create another song
         Song track3 = new Song("Fever", "Ray Charles");									//Create a third song
         this.albumTracks.add(track1);                                          			//Add the first song to song list for Ray Charles
         this.albumTracks.add(track2);                                          			//Add the second song to song list for Ray Charles 
         this.albumTracks.add(track3);														//Add the third song to the song list for Ray Charles
         return albumTracks;                                                    			//Return the songs for Ray Charles in the form of an ArrayList
    }
}