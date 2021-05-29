package day08_casting_scanner;

public class CastingExamples
{
    public static void main(String[]args)
    {
        //byte - short-int -long
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        int num4 = 1000;
        long num5 = num4;
        float num6 = 124.4F;
        double num7 = num6;

        int num8 = 3456;
        double num9 = num8;
        System.out.println(num8);
        // soutv enter => shortcut System.out.println()
        System.out.println("num9 = " + num9);

        int num10 =55;
        byte num11 =(byte)num10;
        
        long num12=444L;
        int num13=(int)num12;//cast it or convert


        System.out.println("num12 = " + num12);
        System.out.println("num13 = " + num13);
        
        double num14= 55.3;
        float num15= (float) num14;
        System.out.println("num15 = " + num15);

        double num16 = 1234.5;
        int num17 = (int)num16;
        System.out.println("num16 = " + num16);//1234.5
        System.out.println("num17 = " + num17);//1234
        int num18 =300;
        byte num19=(byte)num18;
        System.out.println("num19 = " + num19);
        
        char letter='Z';
        int numLetter=letter;
        System.out.println("letter: " +letter);
        System.out.println("numLetter = " + numLetter);
        double d=10.5;
        short sh = (short)d;
        System.out.println(sh);//10


                


    }
}
