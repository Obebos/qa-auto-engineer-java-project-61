package games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    public static void startGame() {
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = even();
        Engine.runGame(gameData, gameDescription);
    }
    public static String[][] even() {
        Random random = new Random();
        String[][] gameData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(100) + 1;
            String question = "Question: " + num;
            String res = "";
            if (num % 2 == 0) {
                res = "yes";
            } else {
                res = "no";
            }
            gameData[i][0] = question;
            gameData[i][1] = res;
        }
        return gameData;
    }
//    public static boolean gameEven() {
//        int i = 0;
//        Random random = new Random();
//        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
//        while (i < 3) {
//            int num = random.nextInt(100) + 1;
//            System.out.println("Question: " + num);
//            Scanner ans = new Scanner(System.in);
//            String ansCur = ans.nextLine().toLowerCase();
//            if (num % 2 == 0 && ansCur.equals("yes")) {
//                System.out.println("Correct!");
//                i++;
//            } else if (num % 2 == 0 && ansCur.equals("no")) {
//                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
//                return false;
//            } else if (num % 2 != 0 && ansCur.equals("no")) {
//                System.out.println("Correct!");
//                i++;
//            } else if (num % 2 != 0 && ansCur.equals("yes")) {
//                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
//                return false;
//            }
//
//        }
//        return true;
//    }

}
