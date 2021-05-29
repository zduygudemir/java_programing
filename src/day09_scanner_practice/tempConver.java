package day09_scanner_practice;
import java.util.Scanner;
public class tempConver {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("******* F to C converter program *****" );
        System.out.println("Enter temperature Fahrenheit");
        double tpF=scan.nextDouble();
        double tpC=(tpF-32)*5/9;
        System.out.println("Temperature Celcius value  is "+tpC);
    }


}
