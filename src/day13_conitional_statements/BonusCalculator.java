package day13_conitional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 3000.0;
        if (salesAmount <= 1000) {
            System.out.println("Good jpb, you are qualified for full bonus");
            bonus += 50;//condational value assignment

        } else {
            System.out.println("Good jpb, you are qualified for full bonus");
            bonus += 50;
        }
        System.out.println("your bonus for salesAmount is $" + bonus);
    }
}
