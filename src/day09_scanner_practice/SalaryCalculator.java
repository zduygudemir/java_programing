package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        System.out.println("Enter hourly rate: ");


       // Scanner salary =new Scanner(System.in);
      //  double hourlyRate = salary.nextDouble();
        double hourlyRate=50.0;
        double weeklyRate = hourlyRate*40;
        double monthlyRate = weeklyRate*4;
        // or weeklyPay * 52/12;(52 year of week)
        double annualRate = weeklyRate*12;


        System.out.println("Weekly rate= " +weeklyRate);
        System.out.println("monthly rate= "+monthlyRate);
        System.out.println("annual Rate= "+ annualRate);

    }
}
