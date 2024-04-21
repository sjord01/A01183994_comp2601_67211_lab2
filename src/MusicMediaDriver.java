
/**
 * A driver class to demonstrate the usage of the MusicMediaPlaylist class.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public class MusicMediaDriver {

	public static void main(String[] args) {
		runMusicMediaPlaylist();

	}
	
    /**
     * Runs the MusicMediaPlaylist by creating some music media objects, adding them to a playlist,
     * and displaying the playlist.
     */
	public static void runMusicMediaPlaylist() {
		MusicMedia compactDisc = new CompactDisc("Summer Renaissance", "Beyonce", 16);
		MusicMedia audioFile = new AudioFile("Sweet Honey Buckin", "Beyonce", 320);
		MusicMedia vynilRecord = new VynilRecord("Levi's Jeans", "Beyonce", 27, 12, 200);
		
		MusicMediaPlaylist playlist = new MusicMediaPlaylist();
		
		playlist.addMedia(compactDisc);
		playlist.addMedia(audioFile);
		playlist.addMedia(vynilRecord);
		
		playlist.displayMedia();
	}
}
