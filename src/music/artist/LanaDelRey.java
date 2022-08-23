package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class LanaDelRey {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public LanaDelRey() {
    }
    
    public ArrayList<Song> getLanaDelReySongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("High By The Beach", "Lana Del Rey");             //Create a song
         Song track2 = new Song("Young and Beautiful", "Lana Del Rey");
         Song track3 = new Song("Blue Jeans", "Lana Del Rey");
         Song track4 = new Song("Born To Die", "Lana Del Rey"); 
         Song track5 = new Song("Summertime Sadness","Lana Del Rey");
         Song track6 = new Song("Gods & Monsters", "Lana Del Rey"); 
         Song track7 = new Song("Video Games", "Lana Del Rey"); 
         Song track8 = new Song("Salvatore", "Lana Del Rey"); 
         Song track9 = new Song("Freak", "Lana Del Rey"); 
         Song track10 = new Song("Love Song", "Lana Del Rey"); 
         Song track11 = new Song("Brooklyn Baby", "Lana Del Rey"); 
         Song track12 = new Song("West Coast", "Lana Del Rey"); 
         Song track13 = new Song("Off To The Races", "Lana Del Rey"); 
         Song track14 = new Song("Art Deco", "Lana Del Rey"); 
         Song track15 = new Song("How to disappear", "Lana Del Rey"); 
         Song track16 = new Song("Mariners Apartment Complex", "Lana Del Rey"); 
         Song track17 = new Song("Lust For Life(with The Weeknd)", "Lana Del Rey"); 
         Song track18 = new Song("Cherry", "Lana Del Rey"); 
         Song track19 = new Song("Venice B****", "Lana Del Rey"); 
         Song track20 = new Song("California", "Lana Del Rey"); 
         Song track21 = new Song("Shades of Cool", "Lana Del Rey"); 
         Song track22 = new Song("Text Book", "Lana Del Rey"); 
         Song track23 = new Song("In My Feelings", "Lana Del Rey"); 
         Song track24 = new Song("Black Beauty", "Lana Del Rey"); 
         Song track25 = new Song("Diet Mountain Dew", "Lana Del Rey"); 
         Song track26 = new Song("Lolita", "Lana Del Rey"); 
         this.albumTracks.add(track1);                                          
         this.albumTracks.add(track2);  
         this.albumTracks.add(track3);
         this.albumTracks.add(track4);
         this.albumTracks.add(track5);
         this.albumTracks.add(track6);                                          
         this.albumTracks.add(track7);  
         this.albumTracks.add(track8);
         this.albumTracks.add(track9);
         this.albumTracks.add(track10);  
         this.albumTracks.add(track11);                                          
         this.albumTracks.add(track12);  
         this.albumTracks.add(track13);
         this.albumTracks.add(track14);
         this.albumTracks.add(track15);
         this.albumTracks.add(track16);                                          
         this.albumTracks.add(track17);  
         this.albumTracks.add(track18);
         this.albumTracks.add(track19);
         this.albumTracks.add(track20);
         this.albumTracks.add(track21);                                          
         this.albumTracks.add(track22);  
         this.albumTracks.add(track23);
         this.albumTracks.add(track24);
         this.albumTracks.add(track25);
         this.albumTracks.add(track26);
         return albumTracks;                                                    
    }
}
