package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.numbersOfRounds;

public class Prime {
	final static String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

	public static String[] generateRoundData() {
		String[] taskNumberAndRightAnswer = new String[2];
		var x = Math.random() * 25;
		int number = (int)x;
		String correctAnswer = isPrime(number) ? "yes" : "no";
		taskNumberAndRightAnswer[0] = String.format("%d", number);
		taskNumberAndRightAnswer[1] = correctAnswer;
		return taskNumberAndRightAnswer;
	}

	public static boolean isPrime(int number) {
		if (number == 1 || number == 2 || number == 3 || number == 5 || number == 7) {
			return true;
		}
		return (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0);
	}
	public static void runGame() {
		String[][] roundsData = new String[numbersOfRounds][2];
		for (int i = 0; i < numbersOfRounds; i++) {
			roundsData[i] = generateRoundData();
		}
		Engine.gameProcess(roundsData, gameTask);
	}
}
