package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner greet = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = greet.next();
        System.out.println();
        System.out.println("Hello, " + name + "!");
    }

    public static String getUserName() {
        return name;
    }
}
