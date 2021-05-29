package day09_scanner_practice;

public class CentstoDollars
{
    public static void main(String[] args){
        System.out.println("Cents =");
        int cents=110;
        int dollar=cents/100;
        int remainingCent=cents%100;
        System.out.println("cents = "+cents);
        System.out.println("dollar = "+dollar);
        System.out.println("remainingCents = "+remainingCent);
        System.out.println("In "+cents+" cents : $"
                + dollar+" and "+ remainingCent+" cents");

    }

}
