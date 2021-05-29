package day_27_loops;

public class IndexOf {
    public static void main(String[] args){

        String word = "github";
        char letter = 'h';
        int index = -1;

        for(int n=0; n<word.length(); n++ ){
            System.out.println(n+"-"+ word.charAt(n));


            if(letter == word.charAt(n) ){

                index = n;

                System.out.println(letter+" is found at index "+index);
                break; // exit the for loop

            }


        }
        if(index == -1){

            System.out.println(letter + " is not present");
        }
        else{

            System.out.println(letter+" is found at index "+index);
        }


    }
}
