package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.numbersOfRounds;

public class Prime {
	static final String gameTask = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
	static final int maxNumber = 100;

	public static String[] generateRoundData() {
		String[] taskNumberAndRightAnswer = new String[2];
		var x = Math.random() * maxNumber;
		int number = (int)x;
		String correctAnswer = isPrime(number) ? "yes" : "no";
		taskNumberAndRightAnswer[0] = String.format("%d", number);
		taskNumberAndRightAnswer[1] = correctAnswer;
		return taskNumberAndRightAnswer;
	}

	public static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return true;
		}
		for (var i = 2; i< number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void runGame() {
		String[][] roundsData = new String[numbersOfRounds][2];
		for (int i = 0; i < numbersOfRounds; i++) {
			roundsData[i] = generateRoundData();
		}
		Engine.gameProcess(roundsData, gameTask);
	}
}
