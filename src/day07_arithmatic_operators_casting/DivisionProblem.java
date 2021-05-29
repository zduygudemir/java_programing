package day07_arithmatic_operators_casting;

public class DivisionProblem
{
    public static void main(String[] args)
    {
        System.out.println(10 / 3);//3
        System.out.println(5 / 2);//2
        int num1 = 40;
        int num2 = 15;
        System.out.println(num1 / num2);//2
        System.out.println(5.0 / 2.0);
        System.out.println(5.0 / 2);
        double d1 = 12;
        double d2 = 3;
        System.out.println(d1 / d2);
         int count = 100;
         double dcount = 30.0;
         System.out.println(count / dcount);
         //primitive casting:primitive conversion the above line will
        // show error,because int is larger data type byte.
        // Even though the value is only
       // int n1 = 4;
       // byte b1 = n1; error
           byte n1=4;
           int b1=n1;//it works



    }
}
