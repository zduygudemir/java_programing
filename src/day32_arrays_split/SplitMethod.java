package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args){
        String word = "Java#Ruby#Python#selenium#html";
        String[] wordsArray = word.split("#");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = "+wordsArray.length);

        String sentence = "today I am coding java arrays";
        String[] s =sentence.split(" ");
        System.out.println(Arrays.toString(s));
        int count = 0;

        for(String each :wordsArray) {
            System.out.println(each);
            count++;
        }
        System.out.println(count+" words in sentence of \'"+sentence+"\'");

        // OR

        System.out.println("first word: "+ s[0]);
        System.out.println("first word: "+sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = "+s.length);



    }
}
