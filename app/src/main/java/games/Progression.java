package games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;


public class Progression {
//    public static boolean progGame() {
//        System.out.println("What number is missing in the progressio?");
//        int i = 0;
//        while (i < 3) {
//            String currentRes = Progression.prog();
//            System.out.print("Your answer");
//            Scanner ans = new Scanner(System.in);
//            String answer = ans.nextLine();
//            if (currentRes.equals(answer)) {
//                System.out.println("Correct!");
//                i++;
//            } else {
//                System.out.println(answer + " is wrong answer ;(. Correct answer was " + currentRes);
//                return false;
//            }
//        }
//        return true;
//    }

    public static void startGame() {
        String gameDescription = "What number is missing in the progression?";
        String[][] gameData = progGame();
        Engine.runGame(gameData, gameDescription);
    }

    public static String[][] progGame() {
        Random random = new Random();
        int unknownNum = random.nextInt(8) + 1;
        String[][] gameData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            String res = "";
            String[] ans = prog();
            res = ans[unknownNum];
            ans[unknownNum] = "..";
            String question = "Question: " + Arrays.toString(ans);
            gameData[i][0] = question;
            gameData[i][1] = res;
        }
        return gameData;
    }

    public static String[] prog() {
        Random random = new Random();
        int firstNum = random.nextInt(20) + 1;
        int sum = firstNum;
        int index = random.nextInt(7) + 1;
        String[] prog = new String[8];
        prog[0] = Integer.toString(firstNum);
        for (int i = 1; i < prog.length; i++) {
            sum = sum + index;
            prog[i] = Integer.toString(sum);
        }
        return prog;
    }
}
