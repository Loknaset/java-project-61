package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n0 - Exit");
        System.out.println("Your choice:");
        Scanner number = new Scanner(System.in);
        String numberOfGame = number.nextLine();
        switch (numberOfGame) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                Even.runGame();
                break;
            case "3":
                Cli.greeting();
                Calc.runGame();
                break;
            default:
                System.exit(0);
        }
    }
}
