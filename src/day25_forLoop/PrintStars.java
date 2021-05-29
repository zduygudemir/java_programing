package day25_forLoop;

public class PrintStars {
    public static void main(String[] args){
        for(int i= 1; i<=15; i++){
            System.out.print("\u2b50 ");

        }

        //for loo: fill 5 stars to myStars variable.
        System.out.println();
        String myStars = "";

        for (int stars = 1 ; stars<=5; stars++) {
            myStars += "\uD83C\uDF1F ";
        }

            System.out.println(" my stars = "+myStars.trim());


    }
}
