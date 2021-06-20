package day11_comperation_operators;
import java.util.Scanner;

public class ComparisonExamples {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your speed");

     int currentSpeed = scan.nextInt();
     int speedLimit = 55;

     System.out.println(currentSpeed > speedLimit);
     System.out.println(currentSpeed < speedLimit);
     System.out.println(currentSpeed == speedLimit);

     boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - "+ isSpeeding);
        System.out.println("currentSpeed = "+currentSpeed+" mph");
        System.out.println("speedLimit = "+speedLimit+" mph");

      double accountBalance = 250.25;
      double itemPrice = 200.99;
        System.out.println("can I afford? - "+(accountBalance >= itemPrice));//true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " +canAfford);

       accountBalance = accountBalance - itemPrice;
        accountBalance-=itemPrice;

        boolean isbroke=accountBalance <= 0;
        System.out.println("you are broke? - "+isbroke );





    }

}
