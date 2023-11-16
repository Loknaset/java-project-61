package hexlet.code;

import java.util.Scanner;

public class Engine {
	public static final int numbersOfRounds = 3;


	public static void gameProcess(String[][] roundsData, String gameTask) {
		Scanner answer = new Scanner(System.in);
		System.out.println(gameTask);
		for (int i = 0; i < numbersOfRounds; i++) {
			System.out.println("Question: " + roundsData[i][0]);
			System.out.println("Your answer: ");
			String userAnswer = answer.next();
			if (!userAnswer.equals(roundsData[i][1])) {
				System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s", userAnswer, roundsData[i][1], Cli.getUserName());
				return;
			}
			System.out.println("Correct!");
		}
		System.out.println("Congratulations, " + Cli.getUserName() + "!");
	}
}
