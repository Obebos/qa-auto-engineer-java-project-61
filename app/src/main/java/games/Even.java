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
}
