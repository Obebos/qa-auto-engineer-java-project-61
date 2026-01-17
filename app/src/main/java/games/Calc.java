package games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    //    public static boolean calcGame() {
//       int i = 0;
//        System.out.println("What is the result of the expression?");
//        while (i < 3) {
//            int currentRes = Calc.calculate();
//            System.out.print("Your answer");
//            Scanner ans = new Scanner(System.in);
//            int answer = ans.nextInt();
//            if (answer == currentRes) {
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
        String gameDescription = "What is the result of the expression?";
        String[][] gameData = calculate();
        Engine.runGame(gameData, gameDescription);
    }


    private static final Random RANDOM = new Random();

    public static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = RANDOM.nextInt(operators.length);
        return operators[randomIndex];
    }

    public static String[][] calculate() {
        Random random = new Random();
        String[][] gameData = new String[3][2];
        for (int i = 0; i < 3; i++) {
            int firstNum = random.nextInt(50) + 1;
            int secondNum = random.nextInt(50) + 1;
            int res = 0;
            String question = "";
            char operator = Calc.getRandomOperator();
            switch (operator) {
                case '+':
                    res = firstNum + secondNum;
                    question = firstNum + "+" + secondNum;
                    break;
                case '-':
                    res = firstNum - secondNum;
                    question = firstNum + "-" + secondNum;
                    break;
                case '*':
                    res = firstNum * secondNum;
                    question = firstNum + "*" + secondNum;
                    break;
                default:
                    System.out.println("Sorry");
                    break;
            }
            gameData[i][0] = question;
            gameData[i][1] = String.valueOf(res);

        }
        return gameData;
    }
}
