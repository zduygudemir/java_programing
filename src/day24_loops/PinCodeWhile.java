package day24_loops;
import java.util.*;
public class PinCodeWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int secretPincode = 1234;

        int pinCode;
         do{

             System.out.println("Enter your pin code= ");
             pinCode = scan.nextInt();



         }while( pinCode != secretPincode );
    }

}
