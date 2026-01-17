package hexlet.code;


import games.Calc;
import games.Even;
import games.Gcd;
import games.Progression;
import games.Prime;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
//                    System.out.println("Welcome to the Brain Games!");
//                    System.out.println("May I have your name?");
//                    userName = Cli.getName();
//                    Cli.greeting();
                Cli.greeting();
                break;
            case "2":
//                    if (userName == null) {
//                        System.out.println("Welcome to the Brain Games!");
//                        System.out.println("May I have your name?");
//                        userName = Cli.getName();
//                        Cli.greeting();
//                    } else {
//                        System.out.println("Hello, " + userName + "!");
//                    }
//                    boolean state = Even.gameEven();
//                    if (state) {
//                        System.out.println("Congratulations, " + userName);
//                    } else {
//                        System.out.println("Let's try again, " + userName);
//                    }
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
//                    if (userName == null) {
//                        System.out.println("Welcome to the Brain Games!");
//                        System.out.println("May I have your name?");
//                        userName = Cli.getName();
//                        Cli.greeting();
//                    } else {
//                        System.out.println("Hello, " + userName + "!");
//                    }
//                    boolean stateGcd = Gcd.gcdGame();
//                    if (stateGcd) {
//                        System.out.println("Congratulations, " + userName);
//                    } else {
//                        System.out.println("Let's try again, " + userName);
//                    }
                Gcd.startGame();
                break;
            case "5":
//                    if (userName == null) {
//                        System.out.println("Welcome to the Brain Games!");
//                        System.out.println("May I have your name?");
//                        userName = Cli.getName();
//                        Cli.greeting();
//                    } else {
//                        System.out.println("Hello, " + userName + "!");
//                    }
//                    boolean stateProg = Progression.progGame();
//                    if (stateProg) {
//                        System.out.println("Congratulation, " + userName);
//                    } else {
//                        System.out.println("Let's try again, " + userName);
//                    }
                Progression.startGame();
                break;
            case "6":
//                    if (userName == null) {
//                        System.out.println("Welcome to the Brain Games!");
//                        System.out.println("May I have your name?");
//                        userName = Cli.getName();
//                        Cli.greeting();
//                    } else {
//                        System.out.println("Hello, " + userName + "!");
//                    }
//                    boolean statePrime = Prime.primeGame();
//                    if (statePrime) {
//                        System.out.println("Congratulations, " + userName);
//                    } else {
//                        System.out.println("Let's try again, " + userName);
//                    }
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
