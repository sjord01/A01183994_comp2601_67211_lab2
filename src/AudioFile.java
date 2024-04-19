/**
 * This class represents an audio file as a specific type of music media,
 * inheriting functionality from the MusicMedia class and adding features
 * specific to audio files, such as file size.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public class AudioFile extends MusicMedia {

	private int fileSizeBPS;

	private static final int MIN_FILESIZE_BPS = 32;
	private static final int MAX_FILESIZE_BPS = 320;

	public AudioFile() {
		super();
	}

	/**
	 * Constructs a new AudioFile object with the specified title, artist, and file
	 * size.
	 *
	 * @param musicTitle  The title of the music in the audio file.
	 * @param musicArtist The artist of the music in the audio file.
	 * @param fileSizeBPS The file size of the audio file in bits per second.
	 */
	public AudioFile(final String musicTitle, final String musicArtist, final int fileSizeBPS) {
		super(musicTitle, musicArtist);
		setFileSizeBPS(fileSizeBPS);
	}

	/**
	 * Retrieves the file size of the audio file in bits per second.
	 *
	 * @return The file size of the audio file in bits per second.
	 */
	public final int getFileSizeBPS() {
		return fileSizeBPS;
	}

	/**
	 * Sets the file size of the audio file in bits per second.
	 *
	 * @param fileSizeBPS The file size to be set.
	 * @throws IllegalArgumentException if the provided file size is outside the
	 *                                  allowed range.
	 */
	public final void setFileSizeBPS(final int fileSizeBPS) {
		if (fileSizeBPS < MIN_FILESIZE_BPS || fileSizeBPS > MAX_FILESIZE_BPS) {
			throw new IllegalArgumentException("Invalide audio file size: " + fileSizeBPS);
		}
		this.fileSizeBPS = fileSizeBPS;
	}

	/**
	 * Provides a string representation of the AudioFile object, including its file
	 * size and information inherited from the MusicMedia class.
	 *
	 * @return A string representation of the AudioFile object.
	 */
	@Override
	public String toString() {
		return "AudioFile [fileSizeBPS=" + fileSizeBPS + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Implements the play method to indicate that an audio file is playing.
	 */
	@Override
	public void play() {
		System.out.println("Audio File is playing");
	}

}
