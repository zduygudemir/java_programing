package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args){
        double num1,num2;
        char operator ;
        num1 =3;
        num2=4;
        operator='/';
        if (operator=='+'){
            System.out.println("add number ="+(num1 + num2));
        }else if(operator == '-'){
            System.out.println("minus = "+(num1-num2));
        }else if(operator=='/'){
            System.out.println("divide = "+(num1/num2));
        }else if (operator == '*'){
            System.out.println("multiple = "+(num1*num2));
        }else {
            System.out.println("invalid number");
        }
        }
}
