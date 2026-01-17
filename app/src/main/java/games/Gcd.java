package games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    public static void startGame() {
        String gameDescription = "Find the greatest common divisor of given numbers.";
        String[][] gameData = gcdNum();
        Engine.runGame(gameData, gameDescription);
    }


    public static String[][] gcdNum() {
        String[][] gameData = new String[3][2];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int firstNum = random.nextInt(50) + 1;
            int secondNum = random.nextInt(50) + 1;
            String question = "Question: " + firstNum + " " + secondNum;
            int res = 0;
            while (secondNum != 0) {
                res = firstNum % secondNum;
                firstNum = secondNum;
                secondNum = res;
            }
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(firstNum);
        }
        return gameData;
    }
}
