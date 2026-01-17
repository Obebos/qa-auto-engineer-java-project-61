package hexlet.code;


import games.Calc;
import games.Even;
import games.Gcd;
import games.Progression;
import games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - Gcd");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner choose = new Scanner(System.in);
        String ch1 = choose.nextLine();
        switch (ch1) {
            case "1":
                Cli.getName();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                Gcd.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                Prime.startGame();
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("Invalid choice, please try again.");
                break;
        }
    }
}
