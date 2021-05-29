package day11_comperation_operators;

public class prePostIncrementDecrementOperators {
    public static void main(String[] args){
        //PRE-INCREMENT ++ increase by 1
        int num1 = 10;//num1: 10
        int num2 = ++num1;//num1 10 + 1
        System.out.println("num1 = "+ num1);//11
        System.out.println("num2 = " +num2);//11

        int num3 = 4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = "+ num3);
        System.out.println("num4 = "+num4 );

        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = "+apples);
        System.out.println("basket ="+ basket);
        int kiwi = 15;
        int kiwibasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = "+kiwibasket);

        int cars = 5;
        System.out.println(++cars);//6

        int sedans =10;//
        System.out.println(sedans++);//10
        System.out.println(sedans);

        int mynumber = 44;
        ++mynumber;
        System.out.println(mynumber);

        int phoneNumber= 15;
        int yourNumber= phoneNumber++;
        System.out.println(phoneNumber);
        System.out.println(yourNumber);
        int a=50;
        int b =22;
        int c =  a++ + ++b;
        //  73 = 50  +  23
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

    }
}
