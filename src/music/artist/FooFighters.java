package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class FooFighters {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public FooFighters() {
    }
    
    public ArrayList<Song> getFooFightersSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("The Pretender", "Foo Fighters");             //Create a song
         Song track2 = new Song("Learn to Fly", "Foo Fighters");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Foo Fighters
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Foo Fighters 
         return albumTracks;                                                    //Return the songs for the Foo Fighters in the form of an ArrayList
    }
}
