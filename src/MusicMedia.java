
/**
 * Represents a generic media item that contains music, providing functionality
 * for storing and retrieving information about the music title and artist.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public abstract class MusicMedia {

	private String musicTitle;
	private String musicArtist;

	private static final int MIN_LABEL_LENGTH = 0;
	private static final int MAX_LABEL_LENGTH = 30;

	public MusicMedia() {
		super();
	}

	/**
	 * Constructs a new MusicMedia object with the specified title and artist.
	 * 
	 * @param musicTitle  The title of the music.
	 * @param musicArtist The artist of the music.
	 */
	public MusicMedia(final String musicTitle, final String musicArtist) {
		super();
		setMusicTitle(musicTitle);
		setMusicArtist(musicArtist);
	}

	/**
	 * Retrieves the title of the music.
	 * 
	 * @return The title of the music.
	 */
	public final String getMusicTitle() {
		return musicTitle;
	}

	/**
	 * Retrieves the artist of the music.
	 * 
	 * @return The artist of the music.
	 */
	public final String getMusicArtist() {
		return musicArtist;
	}

	/**
	 * Sets the title of the music.
	 * 
	 * @param musicTitle The title of the music to be set.
	 * @throws IllegalArgumentException if the provided music title is null, empty,
	 *                                  or exceeds the allowed length.
	 */
	public final void setMusicTitle(final String musicTitle) {
		if (musicTitle == null || musicTitle.isEmpty()) {
			throw new IllegalArgumentException("Invalid music title: " + musicTitle);
		}
		if (musicTitle.length() < MIN_LABEL_LENGTH || musicTitle.length() > MAX_LABEL_LENGTH) {
			throw new IllegalArgumentException("Invalid music title: " + musicTitle);
		}
		this.musicTitle = musicTitle;
	}

	/**
	 * Sets the artist of the music.
	 * 
	 * @param musicArtist The artist of the music to be set.
	 * @throws IllegalArgumentException if the provided music artist is null, empty,
	 *                                  or exceeds the allowed length.
	 */
	public final void setMusicArtist(final String musicArtist) {
		if (musicArtist == null || musicArtist.isEmpty()) {
			throw new IllegalArgumentException("Invalid music artist: " + musicArtist);
		}
		if (musicArtist.length() < MIN_LABEL_LENGTH || musicArtist.length() > MAX_LABEL_LENGTH) {
			throw new IllegalArgumentException("Invalid music artist: " + musicArtist);
		}
		this.musicArtist = musicArtist;
	}

	/**
	 * Provides a string representation of the MusicMedia object, including its
	 * title and artist.
	 * 
	 * @return A string representation of the MusicMedia object.
	 */
	@Override
	public String toString() {
		return "MusicMedia [musicTitle=" + musicTitle + ", musicArtist=" + musicArtist + "]";
	}

	/**
	 * Abstract method representing the action of playing the music.
	 */
	public abstract void play();
}
