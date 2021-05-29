package day25_forLoop;

public class SumOfNumbers {
    public static void main(String[] args){
        int sum = 0;
         //0 + 1 + 2 + 3 + 4 + 5
        for (int count=1 ;count<=5; count++) {

            System.out.print(count+" ");

            sum += count;

        }
        System.out.println();

        System.out.println("Sum = "+sum);
    }
}
