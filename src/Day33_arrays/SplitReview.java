package Day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args){
        String word ="java";
        String[] words = word.split("a");
        System.out.println(words.length);
        int countOfA = words.length-1;
        if(word.endsWith("a")){// if ends with a, add one more.
            countOfA++;
        System.out.println("countOfA = "+countOfA);

        }
        String word1 ="java";
        String[] word2 = word1.split("");
        System.out.println(word2.length);
        System.out.println(Arrays.toString(word2));

        String word3 = "java1sql2html";
        String[] word4 = word3.split("\\d");//means any number
        System.out.println((Arrays.toString(word4)));

        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }



    }

}
