package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculaterV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        /*System.out.println("Enter number 1=");
        double num1 = scan.nextDouble();
        System.out.println("Enter number 2=");
        double num2 = scan.nextDouble();*/
        System.out.println("Enter operator ");
                char operator = scan.next().charAt(0);
                if (operator =='+'){
                    System.out.println("add number ="+(num1 + num2));
                }else if(operator== '-'){
                    System.out.println("minus = "+(num1-num2));
                }else if(operator == '/'){
                    System.out.println("divide = "+(num1/num2));
                }else if (operator == '*'){
                    System.out.println("multiple = "+(num1*num2));
                }else {
                    System.out.println("invalid number");
                }


        }
}
