package day24_loops;
import java.util.*;
public class GIveMe5$ {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dollars = scan.nextInt();
        while (dollars !=5 ){
        System.out.println("Give me % dollars");
        dollars = scan.nextInt();
    }
        System.out.println("Thank you for 5 dollars");


    }


}
