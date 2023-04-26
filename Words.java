import java.util.Random;

public class Words {

	private String[] randomwords = { "animals", "happiness", "indefinite", "study", "birthday", "extreme", "home",
			"tata", "information", " scam", "desert", "hidden", "tree", "ambush", "pirated" , "extraordinary",
			"zoo", "Yatch", "Naruto", "Sasuke", "Kakashi", "MADARA" };

	private String selectedword;
	private String Correctword;

	private Random random = new Random();
	private char[] letters;

	public Words() {
		selectedword = randomwords[random.nextInt(randomwords.length)];
		letters = new char[selectedword.length()];
	}

	public String tostring() {
		StringBuilder text = new StringBuilder();

		for (char letter : letters) {

			text.append(letter == '\u0000' ? '-' : letter);

			text.append(' ');
		}
		return text.toString();
	}

	public boolean isGuessedRight() {
		for (char letter : letters) {
			if (letter == '\u0000') {
				return false;
			}
		}
		return true;
	}

	public boolean guess(char letter) {
		boolean guessRight = false;

		for (int i = 0; i < selectedword.length(); i++) {
			if (letter == selectedword.charAt(i)) {
				letters[i] = letter;
				guessRight = true;
			}
		}
		
		return guessRight;
	}

	public String ohk() {
		Correctword = selectedword;
		return Correctword;

	}
}
