package day25_forLoop;
import java.util.*;
public class StartEnd {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter start and end");
            int start = scan.nextInt();
            int end = scan.nextInt();

            if (start > end) {
                System.out.println("reverse numbering is not supported");
            }

            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }


    }
}
