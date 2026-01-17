package games;

import hexlet.code.Engine;
import java.util.Random;

public class Prime {
//    public static boolean primeGame() {
//        boolean currentAns = Prime.primenum();
//        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
//        Scanner ans = new Scanner(System.in);
//        String answer = ans.nextLine().toLowerCase();
//        return (answer.equals("yes") && currentAns) || (answer.equals("no") && !currentAns);
//
//    }

    public static void startGame() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameData = primeGame();
        Engine.runGame(gameData, gameDescription);
    }

    public static String[][] primeGame() {
        Random random = new Random();
        String[][] gameData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(50) + 1;
            String ans = "";
            String question = "Question: " + num;
            boolean current = primenum(num);
            if (current) {
                ans = "yes";
            } else {
                ans = "no";
            }
            gameData[i][0] = question;
            gameData[i][1] = ans;
        }
        return gameData;
    }

    public static boolean primenum(int num) {
        if (num < 2) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
