package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.numbersOfRounds;

public class Progression {
	static final String gameTask = "What number is missing in the progression?";
	static final int maxProgressionStartNumber = 20;
	static final int maxProgression = 10;
	static final int minNumber = 1;
	static final int numberOfProgression = 10;

	public static String[] generateRoundData() {
		var x = Math.random() * maxProgressionStartNumber;
		int number1 = (int) x;
		var y = minNumber + Math.random() * maxProgression;
		int number2 = (int) y;
		int[] progression = createProgression(number1, number2);
		var z = minNumber + Math.random() * numberOfProgression;
		int hiddenNumber = ((int) z) - minNumber;
		var result = hideNumber(progression, hiddenNumber);
		String progressionWithHiddenNumber = createProgressionWithHiddenNumber(progression, hiddenNumber);
		String[] progressionAndRightAnswer = new String[2];
		progressionAndRightAnswer[0] =String.format("%s", progressionWithHiddenNumber);
		progressionAndRightAnswer[1] = String.valueOf(result);
		return progressionAndRightAnswer;

	}
	public static int[] createProgression(int start, int progressionNumber) {
		int[] progression = new int[10];
		progression[0] = start;
		for (var i = 1; i < 10; i++) {
			progression[i] = progression[i - 1] + progressionNumber;
		}
		return progression;
	}
	public static int hideNumber(int[] progression,int hiddenNumber) {
		return progression[hiddenNumber];
	}
	public static String createProgressionWithHiddenNumber(int[] progression, int hiddenNumber) {
		String[] strArray = new String[progression.length];
		for (var i = 0; i < progression.length; i++) {
			strArray[i] = String.valueOf(progression[i]);
		}
		strArray[hiddenNumber] = "..";
		return String.join(" ", strArray);
	}
	public static void runGame() {
		String[][] roundsData = new String[numbersOfRounds][2];
		for (int i = 0; i < numbersOfRounds; i++) {
			roundsData[i] = generateRoundData();
		}
		Engine.gameProcess(roundsData, gameTask);
	}
}
