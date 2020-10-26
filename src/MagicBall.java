import java.util.Scanner;

public class MagicBall {
	public static void main(String[] args) {
		String answer;
		Answers answers = new Answers();

		System.out.println("What is your question?");
		Scanner theKeyboard = new Scanner(System.in);
		String userQuestion = theKeyboard.nextLine();

		answer = answers.getEightBallAnswers()[answers.randomizer()];

		System.out.println("Magic 8 Ball says: " + answer);

	}

}
