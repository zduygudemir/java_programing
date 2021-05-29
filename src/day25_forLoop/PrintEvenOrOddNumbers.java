package day25_forLoop;

public class PrintEvenOrOddNumbers {
    public static void main (String[] args) {

        System.out.println(("even number 0-100"));
        for (int i = 0; i<=100 ; i++ ) {
            if( i % 2 == 0){
                System.out.print(i+" ");

            }

        }
        System.out.println();
        System.out.println("ODD NUMBER 0 - 100");

        for (int i=0 ; i<=100 ; i++){
            if(i % 2 != 0){
                System.out.print(i+" ");

            }
        }


    }
}
