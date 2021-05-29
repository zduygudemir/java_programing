package day37_methods_overloading;

public class VarArgs {
    public static void main(String [] args){
        addNumbers(10,5);
        addNumbers(10,30,90);
        addNumbers(2,678,45,34,765,45,6,7,86,43,567,456,23577);
    }
    public static void addNumbers(int...nums){
        int sum = 0;
        for(int n:nums){
            sum+=n;
        }
        System.out.println("sum = " + sum);
    }
}