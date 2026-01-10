package hexlet.code;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        String userName;
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner choose = new Scanner(System.in);
        String ch1 = choose.nextLine();
        switch (ch1){
            case "1":
                userName = Cli.getName();
                Cli.greeting();
                break;

        }


    }
}