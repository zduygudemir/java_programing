package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args){
        System.out.println(add(3,9));
        double sum =add(1,3);
        System.out.println(sum);
        System.out.println(minus(10,3));
        System.out.println(multiply(2,5));
        System.out.println((divide(18,9)));

    }
    public static double add(double num1,double num2){

        double result = num1 + num2;
        System.out.print("sum : "+num1+" + "+num2+" = ");
        return result;
    }
    public static double minus(double num1,double num2){

        double result = num1 - num2;
        System.out.print("minus : "+num1+" - "+num2+" = ");
        return result;
    }
    public static double multiply(double num1,double num2){

        double result = num1 * num2;
        System.out.print("multiply : "+num1+" * "+num2+" = ");
        return result;
    }
    public static double divide(double num1,double num2){

        double result = num1 * num2;
        System.out.print("divide : "+num1+" / "+num2+" = ");
        return result;
    }
}
