import java.util.Scanner;

public class GuessTheWord {
	private boolean play = true;
	private Words randomword = new Words();
	private Scanner scanner = new Scanner(System.in);
	private int rounds = 10;
	private char lastRound;

	public void start() {
		do {
			showWord();
			getInput();
			checkInput();
		} while (play);
	}

	void showWord() {
		System.out.println("You have " + rounds + " tries left.");
		System.out.println(randomword.tostring());
	}

	void getInput() {
		System.out.println("Enter a letter to guess the word: ");
		String userGuess = scanner.nextLine();
		lastRound = userGuess.charAt(0);
	}

	void checkInput() {
		boolean isGuessedRight = randomword.guess(lastRound);

		if (isGuessedRight) {
			if (randomword.isGuessedRight()) {
				System.out.println("Congrats , You won!");
				System.out.println("The Word is : " + randomword.tostring());
				play = false;
			}
		} else {
			rounds--;

			if (rounds == 0) {
				System.out.println("GAME OVER!");
				System.out.println("Correct word is :"+ randomword.ohk());
				play = false;
			}
		}
	}

	public void end() {
		scanner.close();
	}
}
