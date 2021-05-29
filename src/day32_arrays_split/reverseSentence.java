package day32_arrays_split;

import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args){
        String sentence = "java is fun";
        String[] revers = sentence.split(" ");

        String reversed = "";
        for(int i=revers.length-1; i>=0; i-- ){
           // System.out.print(revers[i]+" ");
            reversed += revers[i]+" ";

        }
        System.out.println("sentence = "+sentence);
        System.out.println("reversed = "+reversed );

        String word = "java";
        String[] letters = word.split("");
       
    }
}
