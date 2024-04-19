import java.util.ArrayList;

public class MusicMediaPlaylist {

	public static void main(String[] args) {
		playMediaObjects();
	}
	
	public static void playMediaObjects() {
		ArrayList<MusicMedia> musicMediaPlaylist = new ArrayList<>();
		
		MusicMedia compactDisc = new CompactDisc("Summer Renaissance", "Beyonce", 16);
		MusicMedia audioFile = new AudioFile("Sweet Honey Buckin", "Beyonce", 320);
		MusicMedia vynilRecord = new VynilRecord("Levi's Jeans", "Beyonce", 27, 12, 200);
		
		musicMediaPlaylist.add(compactDisc);
		musicMediaPlaylist.add(audioFile);
		musicMediaPlaylist.add(vynilRecord);
		
		for(final MusicMedia musicMedia : musicMediaPlaylist) {
			musicMedia.play();
			System.out.println(musicMedia);
		}
	}

}
