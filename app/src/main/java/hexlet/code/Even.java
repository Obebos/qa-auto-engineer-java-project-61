package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static boolean gameEven() {
        int i = 0;
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (i < 3) {
            int num = random.nextInt(100) + 1;
            System.out.println("Question: " + num);
            Scanner ans = new Scanner(System.in);
            String ansCur = ans.nextLine().toLowerCase();
            if (num % 2 == 0 && ansCur.equals("yes")) {
                System.out.println("Correct!");
                i++;
            } else if (num % 2 == 0 && ansCur.equals("no")) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                return false;
            } else if (num % 2 != 0 && ansCur.equals("no")) {
                System.out.println("Correct!");
                i++;
            } else if (num % 2 != 0 && ansCur.equals("yes")) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                return false;
            }

        }
        return true;
    }
}
