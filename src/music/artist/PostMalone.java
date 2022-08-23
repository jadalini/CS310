package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class PostMalone {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public PostMalone() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Circles", "Post Malone");                      //Create a song
         Song track2 = new Song("Rockstar", "Post Malone");						//Create another song
         Song track3 = new Song("White Iverson", "Post Malone");                     //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Post Malone
         this.albumTracks.add(track2);											//Add the second song to song list for Post Malone 
         this.albumTracks.add(track3);                                          //Add the third song to song list for Post Malone
         return albumTracks;                                                    //Return the songs for Post Malone in the form of an ArrayList
    }
}