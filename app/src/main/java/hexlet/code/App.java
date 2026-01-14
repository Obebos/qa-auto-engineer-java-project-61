package hexlet.code;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        String userName = null;
        while(true) {
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
                    System.out.println("Welcome to the Brain Games!");
                    System.out.println("May I have your name?");
                    userName = Cli.getName();
                    Cli.greeting();
                    break;
                case "2":
                    if(userName == null){
                        System.out.println("Welcome to the Brain Games!");
                        System.out.println("May I have your name?");
                        userName = Cli.getName();
                        Cli.greeting();
                    } else {
                        System.out.println("Hello, " + userName + "!");
                    }
                    boolean state = Even.gameEven();
                    if(state == true){
                        System.out.println("Congratulations, " + userName);
                    } else if (state == false){
                        System.out.println("Let's try again, " + userName);
                    }
                    break;
                case "3":
                    if(userName == null){
                        System.out.println("Welcome to the Brain Games!");
                        System.out.println("May I have your name?");
                        userName = Cli.getName();
                        Cli.greeting();
                    } else {
                        System.out.println("Hello, " + userName + "!");
                    }
                    boolean stateCalc = Calc.calcGame();
                    if(stateCalc == true){
                        System.out.println("Congratulations, " + userName);
                    } else if (stateCalc == false){
                        System.out.println("Let's try again, " + userName);
                    }
                    break;
                case "4":
                    if(userName == null){
                        System.out.println("Welcome to the Brain Games!");
                        System.out.println("May I have your name?");
                        userName = Cli.getName();
                        Cli.greeting();
                    } else {
                        System.out.println("Hello, " + userName + "!");
                    }
                    boolean stateGcd = Gcd.gcdGame();
                    if(stateGcd == true){
                        System.out.println("Congratulations, " + userName);
                    } else if (stateGcd == false){
                        System.out.println("Let's try again, " + userName);
                    }
                    break;
                case "5":
                    if(userName == null){
                        System.out.println("Welcome to the Brain Games!");
                        System.out.println("May I have your name?");
                        userName = Cli.getName();
                        Cli.greeting();
                    } else {
                        System.out.println("Hello, " + userName + "!");
                    }
                    boolean stateProg = Progression.progGame();
                    if(stateProg == true){
                        System.out.println("Congratulation, " + userName);
                    } else {
                        System.out.println("Let's try again, " + userName);
                    }
                    break;
                case "6":
                    if(userName == null){
                        System.out.println("Welcome to the Brain Games!");
                        System.out.println("May I have your name?");
                        userName = Cli.getName();
                        Cli.greeting();
                    } else {
                        System.out.println("Hello, " + userName + "!");
                    }
                    boolean statePrime = Prime.primeGame();
                    if(statePrime ==true){
                        System.out.println("Congratulations, " + userName);
                    } else {
                        System.out.println("Let's try again, " + userName);
                    }
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;

            }

        }
    }
}