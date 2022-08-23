package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Issues {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Issues() {
    }
    
    public ArrayList<Song> getIssuesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Beautiful Oblivion", "Issues");                //Create a song
         Song track2 = new Song("Second Best", "Issues");                       //Create another Song
         Song track3 = new Song("Downfall", "Issues");                          //Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for issues
         this.albumTracks.add(track2);                                          //Add the second song to song list for Issues 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Issues 
         return albumTracks;                                                    //Return the songs for Issues in the form of an ArrayList
    }                                                                           //@author Brandon.Stultz
}

