package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static boolean progGame() {
        System.out.println("What number is missing in the progressio?");
        int i = 0;
        while (i < 3) {
            String currentRes = Progression.prog();
            System.out.print("Your answer");
            Scanner ans = new Scanner(System.in);
            String answer = ans.nextLine();
            if (currentRes.equals(answer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + currentRes);
                return false;
            }
        }
        return true;
    }
    public static String prog() {
        Random random = new Random();
        int firstNum = random.nextInt(20) + 1;
        int sum = firstNum;
        int index = random.nextInt(7) + 1;
        String res = "";
        String[] prog = new String[8];
        prog[0] = Integer.toString(firstNum);
        for (int i = 1; i < prog.length; i++) {
            sum = sum + index;
            prog[i] = Integer.toString(sum);
        }
        int unknownNum = random.nextInt(8) + 1;
        res = prog[unknownNum];
        prog[unknownNum] = "..";
        System.out.println("Question: " + String.join(" ", prog));
        return res;
    }
}
