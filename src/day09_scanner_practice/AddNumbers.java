package day09_scanner_practice;
import java.util.Scanner;
public class AddNumbers {
    public static void main(String[] args){
      /*  Scanner num1= new Scanner(System.in);
        Scanner num2= new Scanner(System.in);
        Scanner num3=new Scanner(System.in);

        int n1=num1.nextInt();
        int n2=num2.nextInt();
        int n3=num3.nextInt();
        System.out.println("Enter 3 numbers ");
        System.out.println(n1+n2+n3+" total");
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("Result = "+result);

    }
}
