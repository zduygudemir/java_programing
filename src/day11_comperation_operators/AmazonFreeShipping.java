package day11_comperation_operators;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total price");
        double totalprice = scan.nextDouble();

        if (totalprice>=25) {
            System.out.println("free shipping ELIGIBLE.your order total: $"+totalprice);
        }else{
            System.out.println("not eligible for free shipping.Your order total: $"+totalprice);
        }
        System.out.println("****THANK YOU SHOPPING AMAZON****");
    }
}
