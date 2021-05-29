package day07_arithmatic_operators_casting;

public class PrimitiveCasting
{
    public static void main(String[] args)
    {
        int num1 = 100;
        byte b1 = (byte)num1;//int large storage translate
        // int to byte like this byte(byte)num1
        short shNum =(short)num1;
        long lnum = num1;
        System.out.println(num1);
        System.out.println(b1);
        System.out.println(shNum);
    }
}
