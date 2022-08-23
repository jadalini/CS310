package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Halsey {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Halsey() {
    }
    
    public ArrayList<Song> getHalseySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Closer", "Halsey");             //Create a song
         Song track2 = new Song("Without Me", "Halsey");         //Create another song
         Song track3 = new Song("Forget Me Too", "Halsey");      //Create yet another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Halsey
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Halsey 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Halsey
         return albumTracks;                                                    //Return the songs for the Halsey in the form of an ArrayList
    }
}
