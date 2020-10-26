import java.util.Random;

public class Answers {
	private String[] eightBallAnswers;

	// constructors
	public Answers() {
		eightBallAnswers = populateEightBallAnswers();
	}

	// method pop 8 ball answers
	public String[] populateEightBallAnswers() {
		return new String[] { "It is decidedly so.", "You may rely on it.", "Absolutely not.", "Not this time around.",
				"That depends on you.", "That hand has not yet been dealt.", "As it was foretold in the scrolls.",
				"As the universe sees fit." };
	}

	public int randomizer() {
		Random generator = new Random();
		return generator.nextInt(eightBallAnswers.length);
	}

	// getters and setters
	public String[] getEightBallAnswers() {
		return eightBallAnswers;
	}

	
	
}
// final bracket
