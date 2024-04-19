/**
 * This class represents a vinyl record as a specific type of music media,
 * inheriting functionality from the MusicMedia class and adding features
 * specific to vinyl records, such as the number of tracks, disc size, and
 * weight.
 * 
 * @author Samson James Ordonez
 * @version 1.0
 */
public class VynilRecord extends MusicMedia {

	private int numOfTracks;
	private double discSizeInches;
	private double weightGrams;

	private static final int MIN_NUM_OF_TRACKS = 1;
	private static final int MAX_NUM_OF_TRACKS = 99;
	private static final int DISC_SIZE_7 = 7;
	private static final int DISC_SIZE_10 = 10;
	private static final int DISC_SIZE_12 = 12;
	private static final int WEIGHT_140G = 140;
	private static final int WEIGHT_180G = 180;
	private static final int WEIGHT_200G = 200;

	public VynilRecord() {
		super();
	}

	/**
	 * Constructs a new VynilRecord object with the specified title, artist, number
	 * of tracks, disc size, and weight.
	 *
	 * @param musicTitle     The title of the music on the vinyl record.
	 * @param musicArtist    The artist of the music on the vinyl record.
	 * @param numOfTracks    The number of tracks on the vinyl record.
	 * @param discSizeInches The size of the vinyl record in inches.
	 * @param weightGrams    The weight of the vinyl record in grams.
	 */
	public VynilRecord(final String musicTitle, final String musicArtist, final int numOfTracks,
			final double discSizeInches, final double weightGrams) {
		super(musicTitle, musicArtist);
		setNumOfTracks(numOfTracks);
		setDiscSizeInches(discSizeInches);
		setWeightGrams(weightGrams);
	}

	/**
	 * Retrieves the number of tracks on the vinyl record.
	 *
	 * @return The number of tracks on the vinyl record.
	 */
	public final int getNumOfTracks() {
		return numOfTracks;
	}

	/**
	 * Retrieves the size of the vinyl record in inches.
	 *
	 * @return The size of the vinyl record in inches.
	 */
	public final double getDiscSizeInches() {
		return discSizeInches;
	}

	/**
	 * Retrieves the weight of the vinyl record in grams.
	 *
	 * @return The weight of the vinyl record in grams.
	 */
	public final double getWeightGrams() {
		return weightGrams;
	}

	/**
	 * Sets the number of tracks on the vinyl record.
	 *
	 * @param numOfTracks The number of tracks to be set.
	 * @throws IllegalArgumentException if the provided number of tracks is outside
	 *                                  the allowed range.
	 */
	public final void setNumOfTracks(final int numOfTracks) {
		if (numOfTracks < MIN_NUM_OF_TRACKS || numOfTracks > MAX_NUM_OF_TRACKS) {
			throw new IllegalArgumentException("Inavalid number of tracks: " + numOfTracks);
		}
		this.numOfTracks = numOfTracks;
	}

	/**
	 * Sets the size of the vinyl record in inches.
	 *
	 * @param discSizeInches The size of the vinyl record to be set.
	 * @throws IllegalArgumentException if the provided disc size is not a standard
	 *                                  size.
	 */
	public final void setDiscSizeInches(final double discSizeInches) {
		if (discSizeInches != DISC_SIZE_7 && discSizeInches != DISC_SIZE_10 && discSizeInches != DISC_SIZE_12) {
			throw new IllegalArgumentException("Invalid disc size: " + discSizeInches);
		}
		this.discSizeInches = discSizeInches;
	}

	/**
	 * Sets the weight of the vinyl record in grams.
	 *
	 * @param weightGrams The weight of the vinyl record to be set.
	 * @throws IllegalArgumentException if the provided weight is not a standard
	 *                                  weight.
	 */
	public final void setWeightGrams(final double weightGrams) {
		if (weightGrams != WEIGHT_140G && weightGrams != WEIGHT_180G && weightGrams != WEIGHT_200G) {
			throw new IllegalArgumentException("Invalid weight: " + weightGrams);
		}
		this.weightGrams = weightGrams;
	}

	/**
	 * Provides a string representation of the VynilRecord object, including its
	 * number of tracks, disc size, weight, and information inherited from the
	 * MusicMedia class.
	 *
	 * @return A string representation of the VynilRecord object.
	 */
	@Override
	public String toString() {
		return "VynilRecord [numOfTracks=" + numOfTracks + ", discSizeInches=" + discSizeInches + ", weightGrams="
				+ weightGrams + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Implements the play method to indicate that a vinyl record is playing.
	 */
	@Override
	public void play() {
		System.out.println("Vynil Record is playing");

	}

}
