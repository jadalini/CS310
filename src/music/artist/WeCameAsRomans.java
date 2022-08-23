package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class WeCameAsRomans {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public WeCameAsRomans() {
    }
    
    public ArrayList<Song> getWeCameAsRomansSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Glad You Came", "WeCameAsRomans");             //Create a song
         Song track2 = new Song("Memories", "WeCameAsRomans");         //Create another song
         Song track3 = new Song("Darkbloom", "WeCameAsRomans");      //Create yet another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the WeCameAsRomans
         this.albumTracks.add(track2);                                          //Add the second song to song list for the WeCameAsRomans 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the WeCameAsRomans
         return albumTracks;                                                    //Return the songs for the WeCameAsRomans in the form of an ArrayList
    }
}