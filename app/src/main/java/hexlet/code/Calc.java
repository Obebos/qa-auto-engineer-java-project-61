package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean calcGame(){
        int i = 0;
        System.out.println("What is the result of the expression?");
        while(i<3){
            int currentRes = Calc.calculate();
            System.out.print("Your answer");
            Scanner ans = new Scanner(System.in);
            int answer = ans.nextInt();
            if (answer == currentRes) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + currentRes);
                return false;
            }
        }
        return true;
    }
    private static final Random RANDOM = new Random();

    public static char getRandomOperator() {
        char[] operators = {'+', '-', '*'};
        int randomIndex = RANDOM.nextInt(operators.length);
        return operators[randomIndex];
    }

    public static int calculate(){
        Random random = new Random();
        int firstNum = random.nextInt(50) + 1;
        int secondNum = random.nextInt(50) + 1;
        int res = 0;
        char operator = Calc.getRandomOperator();
        switch (operator){
            case '+':
                res = firstNum+secondNum;
                System.out.println("Question: " + firstNum + " + " + secondNum);
                break;
            case '-':
                res = firstNum-secondNum;
                System.out.println("Question: " + firstNum + " - " + secondNum);
                break;
            case '*':
                res = firstNum*secondNum;
                System.out.println("Question: " + firstNum + " * " + secondNum);
                break;
        }
        return res;
    }
}

