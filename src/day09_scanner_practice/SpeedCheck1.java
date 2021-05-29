package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheck1 {
    public static void main(String[] args){
        Scanner Speed = new Scanner(System.in);
        short speedLimit=50;
        System.out.println("Enter current speed = ");
        int currentSpeed=Speed.nextInt();
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("Your are driving "
                +overTheLimit+" mph over the limit. " +
                "Slow down!");
    }
}
