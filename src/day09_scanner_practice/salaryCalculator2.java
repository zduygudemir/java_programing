package day09_scanner_practice;
import java.util.Scanner;

public class salaryCalculator2 {
    public static void main(String[] args){
        Scanner salary = new Scanner(System.in);
        System.out.println("Enter hourly rate = ");
        double hourlyRate = salary.nextDouble();
        double weeklyRate = hourlyRate*40;
        double monthlyRate = weeklyRate * 52 /12;
        // (52 year of week)
        double annualRate = weeklyRate*12;

        System.out.println("Weekly rate= " +weeklyRate);
        System.out.println("monthly rate= "+monthlyRate);
        System.out.println("annual Rate= "+ annualRate);


    }
}
