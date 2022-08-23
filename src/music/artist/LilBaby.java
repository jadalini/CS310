package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class LilBaby {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public LilBaby() {
    }
    
    public ArrayList<Song> getLilBabySongs() { 
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Freestyle", "Lil Baby");             //Create a song
         Song track2 = new Song("Drip Too Hard", "Lil Baby");
         Song track3 = new Song("Emotionally Scarred", "Lil Baby"); 
         Song track4 = new Song("Sum 2 Prove", "Lil Baby"); 
         Song track5 = new Song("On Me", "Lil Baby");
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);  
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         this.albumTracks.add(track5);
         return albumTracks;                                                    
}
}
