package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);//in = input

        System.out.print("Pleas enter your name: ");

       // String firstName = " Maria";
        String firstName = scan.next();

        System.out.println("Nice to meet you "+firstName);

    }
}
