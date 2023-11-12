package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
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
            case "4":
                Cli.greeting();
                GCD.runGame();
            case "5":
                Cli.greeting();
                Progression.runGame();
            case "6":
                Cli.greeting();
                Prime.runGame();
            default:
                System.exit(0);
        }
    }
}
