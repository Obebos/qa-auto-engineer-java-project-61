package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static boolean gcdGame(){
        System.out.println("Find the greatest common divisor of given numbers.");
        int i = 0;
        while(i<3){
            int currentRes = Gcd.gcdNum();
            System.out.print("Your answer");
            Scanner ans = new Scanner(System.in);
            int answer = ans.nextInt();
            if(answer == currentRes){
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + currentRes);
                return false;
            }
        }
        return true;

    }

    public static int gcdNum(){
        Random random = new Random();
        int firstNum = random.nextInt(50) + 1;
        int secondNum = random.nextInt(50) + 1;
        int res = 0;
        System.out.println("Question: " + firstNum + " " + secondNum);
        while (secondNum != 0){
            res = firstNum%secondNum;
            firstNum = secondNum;
            secondNum = res;
        }
        return firstNum;
    }
}
