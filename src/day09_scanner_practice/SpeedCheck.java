package day09_scanner_practice;

public class SpeedCheck {
    public static void main(String[] args) {
        short speedLimit = 55;
        short currentSpeed = 70;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit);
    }
}
