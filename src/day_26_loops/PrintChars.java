package day_26_loops;
import java.util.*;
public class PrintChars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        for(int i = 0; i < word.length();  i++){

            System.out.println(i+"-"+word.charAt(i));

        }
            System.out.println("====");


        for(int i =word.length()-1; i>=0; i--){

            System.out.println(i+"_"+word.charAt(i));
        }
    }
}

