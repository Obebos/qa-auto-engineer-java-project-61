package hexlet.code;

import java.util.Scanner;

public class Cli {


    public static String getUserName(){
        Scanner n1 = new Scanner(System.in);
        String n = n1.nextLine();
        return "Hello, " + n;
    }
}
