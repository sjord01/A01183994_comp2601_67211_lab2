import java.util.ArrayList;

/**
 * A class representing a playlist/collection of music media.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public class MusicMediaPlaylist {

	private ArrayList<MusicMedia> musicMediaPlaylist;

	public MusicMediaPlaylist() {
		super();
		this.musicMediaPlaylist = new ArrayList<>();
	}

	/**
     * Adds a music media to the playlist.
     * @param media The music media to be added.
     */
	public void addMedia(final MusicMedia media) {
		if (media != null) {
			musicMediaPlaylist.add(media);
		}
	}

    /**
     * Removes a music media from the playlist.
     * 
     * @param media The music media to be removed.
     */
	public void removeMedia(final MusicMedia media) {
		musicMediaPlaylist.remove(media);
	}

	/**
	 * Displays all the music media in the playlist.
	 */
	public void displayMedia() {
		for (final MusicMedia musicMedia : musicMediaPlaylist) {
			musicMedia.play();
			System.out.println(musicMedia);
		}
	}

    /**
     * Plays the music with the specified title from the playlist.
     * 
     * @param musicTitle The title of the music to be played.
     * @throws IllegalArgumentException if the provided music title is null or empty.
     */
	public void playMusicTitle(final String musicTitle) {
		if (musicTitle == null || musicTitle.isEmpty()) {
			throw new IllegalArgumentException("Invalid music title input: " + musicTitle);
		}

		boolean isMusicFound = false;

		for (final MusicMedia musicMedia : musicMediaPlaylist) {
			if (musicMedia.getMusicTitle().equalsIgnoreCase(musicTitle)) {
				musicMedia.play();
				System.out.println(musicMedia);
				isMusicFound = true;
			}
		}

		if (!isMusicFound) {
			System.err.println("The music named as " + musicTitle.toUpperCase() + " is not found in the playlist.");
		}

	}

}
