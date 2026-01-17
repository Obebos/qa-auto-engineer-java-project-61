package hexlet.code;

import java.util.Scanner;

public class Cli {


    public static void getName() {
        System.out.println("May I have your name?");
        Scanner n1 = new Scanner(System.in);
        String name = n1.nextLine();
        System.out.println("Hello, " + name + "!");
    }


    }

