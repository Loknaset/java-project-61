package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.numbersOfRounds;

public class Calc {

	static final String gameTask = "What is the result of the expression?";

	public static String[] generateRoundData() {
		String[] operator = {"+", "-", "*"};
		int a = 0;
		int b = 3;
		int random = a + (int) (Math.random() * b);
		var randomOperator = operator[random];

		var x = Math.random() * 25;
		int number1 = (int) x;
		var y = Math.random() * 25;
		int number2 = (int) y;
		String[] expressionAndRightAnswer = new String[2];
		expressionAndRightAnswer[0] = String.format("%d %s %d", number1, randomOperator, number2);
		expressionAndRightAnswer[1] = String.valueOf(calculation(number1, number2, randomOperator));
		return expressionAndRightAnswer;
	}
	public static int calculation(int number1, int number2, String randomOperator) {
		switch (randomOperator) {
			case "+":
				return (number1 + number2);
			case "-":
				return (number1 - number2);
			case "*":
				return (number1 * number2);
			default:
				throw new IllegalArgumentException("operator choosing error");
		}
	}
	public static void runGame() {
		String[][] roundsData = new String[numbersOfRounds][2];
		for (int i = 0; i < numbersOfRounds; i++) {
			roundsData[i] = generateRoundData();
		}
		Engine.gameProcess(roundsData, gameTask);
	}
}
