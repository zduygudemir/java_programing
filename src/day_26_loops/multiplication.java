package day_26_loops;
import java.util.*;
public class multiplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  the number ");
        int a = scan.nextInt();

        if (a<1 || a>10){
            System.out.println("ERROR: invalid input");
            return;//exit the main method.stop the program
        }
            for (int j = 1; j <= 10; j++) {
                System.out.println(a + " x " + j + " = " + (a * j));
            }




    }
}
