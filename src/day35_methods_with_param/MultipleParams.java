package day35_methods_with_param;

public class MultipleParams {
    public static void main(String[] args){

        showSum(3.0,4.0);

    }
    public static void showSum(double num1,double num2){
        double result = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+result);
    }
}
