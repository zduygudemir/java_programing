package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args){
        Scanner shop=new Scanner(System.in);
        System.out.println("-----Welcome Target----");
        System.out.print("Enter price for milk = ");
        double milk=shop.nextDouble();

        System.out.print("Enter price of bread = ");
        double bread=shop.nextDouble();

        System.out.print("Enter price for cucumber = ");
        double cucumber=shop.nextDouble();

        double total=milk+bread+cucumber;
        System.out.println("your total amount = $"+total);

    }
}
