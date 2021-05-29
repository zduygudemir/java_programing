package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10,45));
        System.out.println(Calculator.minus(100,45));
        System.out.println(Calculator.divide(55,4));
        System.out.println(Calculator.multiply(10,2));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(100,45);
        System.out.println( result);
    }
}
  