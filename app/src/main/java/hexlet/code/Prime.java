package hexlet.code;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean primeGame(){
        boolean currentAns = Prime.primenum();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner ans = new Scanner(System.in);
        String answer = ans.nextLine().toLowerCase();
        if((answer.equals("yes") && currentAns == true) || (answer.equals("no") && currentAns == false)){
            return true;
        } else {
            return false;
        }

    }

    public static boolean primenum(){
        Random random = new Random();
        int i = 3;
        int num = random.nextInt(50) + 1;
        System.out.println("Qestion: "+ num);
        if(num<2){
            return false;
        } else if(num == 2){
            return true;
        } else if(num%2==0){
            return false;
        }
        while(i<num){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
