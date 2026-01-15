package hexlet.code;

import java.util.Scanner;

public class Cli {
    static Scanner n1 = new Scanner(System.in);
    static String name = n1.nextLine();

    public static String getName() {
        return name;
    }
    public static void greeting() {
        System.out.println("Hello, " + name + "!");

    }
}
