package day04_variables_intro;

public class VariableNamingRules
{
    public static void main(String[] args)
    {
        // int static= 22;-> static is reserved by java
        int static2 = 22;
        int _static = 22;
        int Public = 45;
        int $_money = 90;
        int World = 49;
//  int 1stMonthSalary = 3000; ->error, cannot start with number
        int $=10;
       // int _ =3;
        System.out.println($);
       // System.out.println(_);
        /*above variable work fine,but not names
        we should use meaningful variable names
        int number
        java naming Convensions packages=>all lowercase
        classname=> start with uppercase, rest camelcase
        HelloWorld.java-> public class HelloWorld

         */
    }
}
