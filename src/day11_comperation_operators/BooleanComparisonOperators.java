package day11_comperation_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args){
        System.out.println(10==10);//true 10 equal 10
        System.out.println(1000>100);//true
        System.out.println(985.44<98547.8);//true
        System.out.println(10<=11);//true
        System.out.println(5>=3);//true
        System.out.println(-100 != 44);//true

        int a=100;
        int b=200;
        System.out.println();
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        boolean result;
        result = 5==5;
        System.out.println("result = "+result);

        result = 33 > 44;
        System.out.println("result = "+result);

        result = 2!=2;
        System.out.println(result);//false

        String city = "Seattle";
        System.out.println(city == "Seattle");//true
        System.out.println(city == "Saettle ");
        System.out.println(city != "Baku");

        String name = "Nadir";
        Boolean checkName = name == "Nadir";
        System.out.println(checkName);

        int age = 66;
        if (age <= 3){
            System.out.println("toddler");
        }
           else
            System.out.println("not toddler");





    }

}
