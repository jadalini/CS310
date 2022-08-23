package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ArcticMonkeys {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ArcticMonkeys() {
    }
    
    public ArrayList<Song> getArcticMonkeysSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("505", "Arctic Monkeys");                       //Create a song
         Song track2 = new Song("Arabella", "Arctic Monkeys");                  //Create another Song                        
         this.albumTracks.add(track1);                                          //Add the first song to song list for Arctic Monkeys
         this.albumTracks.add(track2);                                          //Add the second song to song list for Arctic Monkeys          
         return albumTracks;                                                    //Return the songs for Arctic Monkeys in the form of an ArrayList
    }                                                                           //@author Brandon.Stultz
}
