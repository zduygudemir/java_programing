package day25_forLoop;

public class ForLoopFirst {
    public static void main(String[] args){
        /**
         * below is infinite loop with for lop like:while(ture){}
         * for(;;) {
         * System.out.println("java is fun");
         * }
         */
           // for loop: 1- 10. print the numbers
           // (1)         (2)    (4)
        for (int i = 0; i <= 5; i++) {
                    //         (3)
            System.out.println("Hello World"+i);

        }
         for(int i=1;
             i<=10;
             i++){

              System.out.println(i);

         }
    }
}
