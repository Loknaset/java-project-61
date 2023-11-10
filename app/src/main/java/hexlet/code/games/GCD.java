package hexlet.code.games;

import hexlet.code.Engine;

import java.lang.reflect.Array;
import java.util.Arrays;

import static hexlet.code.Engine.numbersOfRounds;

public class GCD {
	static final String gameTask = "Find the greatest common divisor of given numbers.";

	public static String[] generateRoundData() {
		var x = Math.random() * 100;
		int number1 = (int) x;
		var y = Math.random() * 100;
		int number2 = (int) y;
		String[] numbersAndRightAnswer = new String[2];
		int[] numbers1 = findDivisors(number1);
		int[] numbers2 = findDivisors(number2);
		var result = findGreatestCommonDivisor(numbers1, numbers2);
		numbersAndRightAnswer[0] = String.format("%d %d", number1, number2);
		numbersAndRightAnswer[1] = String.valueOf(result);
		return numbersAndRightAnswer;
	}

	public static int[] findDivisors (int number) {
		int[] divisors = new int[number];
		int index = 0;
		for (var i = 1; i < number; i++) {
			if (number % i == 0) {
				divisors[index] = i;
				index++;
			}
		}
		return Arrays.copyOfRange(divisors,0, index);
	}

	public static int findGreatestCommonDivisor(int[] numbers1, int[] numbers2) {
		int[] Divisiors = new int[numbers1.length];
		int index = 0;
		for (var i = 0; i < numbers1.length; i++) {
			int a = numbers1[i];
			for (var y = 0; y < numbers2.length; y++) {
				if (a == numbers2[y]) {
					Divisiors[index] = a;
					index++;
				}
			}
		}
		int[] commonDivisiors = Arrays.copyOfRange(Divisiors,0, index);
		int max = commonDivisiors[0];
		for (int j = 1; j < commonDivisiors.length; j++) {
			if (commonDivisiors[j] > max) {
				max = commonDivisiors[j];
			}
		}
		return max;
	}

	public static void runGame() {
		String[][] roundsData = new String[numbersOfRounds][2];
		for (int i = 0; i < numbersOfRounds; i++) {
			roundsData[i] = generateRoundData();
		}
		Engine.gameProcess(roundsData, gameTask);
	}
}
