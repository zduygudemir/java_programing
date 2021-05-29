package day09_scanner_practice;
import java.util.Scanner;
public class CentstoDollar2 {
    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter cents = ");
        int cents=scan.nextInt();
        int dollar = cents/100;
        int remainingCent=cents%100;
        System.out.println("cents = "+cents);
        System.out.println("dollar = "+dollar);
        System.out.println("remainingCents = "+remainingCent);
        System.out.println("In "+cents+" cents : $"+
                + dollar +" dolars  and "+ remainingCent+" cents");

    }

}
