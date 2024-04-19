/**
 * This class represents a compact disc (CD) as a specific type of music media,
 * inheriting functionality from the MusicMedia class and adding features
 * specific to CDs, such as the number of tracks.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public class CompactDisc extends MusicMedia {

	private int numOfTracks;

	private static int MIN_NUM_OF_TRACKS = 1;
	private static int MAX_NUM_OF_TRACKS = 99;

	public CompactDisc() {
		super();
	}

	/**
	 * Constructs a new CompactDisc object with the specified title, artist, and
	 * number of tracks.
	 *
	 * @param musicTitle  The title of the music on the compact disc.
	 * @param musicArtist The artist of the music on the compact disc.
	 * @param numOfTracks The number of tracks on the compact disc.
	 */
	public CompactDisc(final String musicTitle, final String musicArtist, final int numOfTracks) {
		super(musicTitle, musicArtist);
		setNumOfTracks(numOfTracks);
	}

	/**
	 * Retrieves the number of tracks on the compact disc.
	 *
	 * @return The number of tracks on the compact disc.
	 */
	public final int getNumOfTracks() {
		return numOfTracks;
	}

	/**
	 * Sets the number of tracks on the compact disc.
	 *
	 * @param numOfTracks The number of tracks to be set.
	 * @throws IllegalArgumentException if the provided number of tracks is outside
	 *                                  the allowed range.
	 */
	public final void setNumOfTracks(final int numOfTracks) {
		if (numOfTracks < MIN_NUM_OF_TRACKS || numOfTracks > MAX_NUM_OF_TRACKS) {
			throw new IllegalArgumentException("Invalid number of tracks: " + numOfTracks);
		}
		this.numOfTracks = numOfTracks;
	}

	/**
	 * Provides a string representation of the CompactDisc object, including its
	 * number of tracks and information inherited from the MusicMedia class.
	 *
	 * @return A string representation of the CompactDisc object.
	 */
	@Override
	public String toString() {
		return "CompactDisc [numOfTracks=" + numOfTracks + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Implements the play method to indicate that a compact disc is playing.
	 */
	@Override
	public void play() {
		System.out.println("Compact Disc is playing");
	}

}
