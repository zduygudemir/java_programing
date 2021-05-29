package day13_conitional_statements;
 import java.util.Scanner;
public class ATMincodeProgram {
    public static void main(String[] args){
        int secretPincode=1234;
       Scanner scan = new Scanner(System.in);
        System.out.println("******* WELCOME TO TD BANK ATM ******* ");
        System.out.println("Enter your pincode ");
        int inputPincode = scan.nextInt();
       // int inputPincode = 1234;
        if(secretPincode == inputPincode){
            System.out.println("Welcom to your account!");
            System.out.println("you can withdraw, check your balance, deposit");

        }else {
            System.out.println("In correct pin code! "+inputPincode);
            System.out.println("Please try again!");
        }
        System.out.print("Thank you for using td bank ATM");

    }

}
