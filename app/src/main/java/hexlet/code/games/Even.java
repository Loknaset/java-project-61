package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Engine.numbersOfRounds;


public class Even {

    static final String gameTask = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int maxNumber = 100;
    public static void runGame() {
        String[][] roundsData = new String[numbersOfRounds][2];
        for (int i = 0; i < numbersOfRounds; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, gameTask);
    }
    public static String[] generateRoundData() {
        String[] taskNumberAndRightAnswer = new String[2];
        var x = Math.random() * maxNumber;
        int number = (int)x;
        String correctAnswer = isEven(number) ? "yes" : "no";
        taskNumberAndRightAnswer[0] = String.format("%d", number);
        taskNumberAndRightAnswer[1] = correctAnswer;
        return taskNumberAndRightAnswer;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}