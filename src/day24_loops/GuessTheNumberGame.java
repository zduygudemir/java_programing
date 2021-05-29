package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


         Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
        do {
            System.out.println("enter your guessing number");
            guessingNumber = scan.nextInt();
              if(guessingNumber > secretNumber){
                System.out.println(" number is larger");
            }else if(guessingNumber < secretNumber){
                System.out.println("number is smaller");
            }


        } while (secretNumber != guessingNumber);
        System.out.println("congratulations you won! your number is ="+guessingNumber);
    }
}
