package day09_scanner_practice;
import java.util.Scanner;
//java.util->is a package name where Scanner class located
public class AskAgeV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //Scanner is a declare like String,int,long...
        //new create new object from a class
        // nextInt= accept int value from keyboard
        //System.in =input the value System.out=output the value
        System.out.println("How old are you" );
        int age = scan.nextInt();
        //nextInt,nextByte,next()=>for string,nextLine()=>for sentences
        System.out.println(age +" that's great age");
       // scan.close() optionally you can close scan



    }
}
