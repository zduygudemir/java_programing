package day22_string_manipulation;

public class StringSubstirng {
    public static void main(String[] args){
        //           012345
        String word ="hello";
        System.out.println(word.substring(2,4));//ll
        System.out.println(word.substring(1));//hello
        System.out.println(word.substring(1,5));//ello
        System.out.println(word.substring(1,3));//el
         //            01234567891011
        String word1 = "java is fun";
        /**
         * 1) word1.substirng(startIndex,endIndex)
         * endIndex is not included
         */
        System.out.println(word1.substring(0,4));
        System.out.println(word1.substring(0,7));
        System.out.println(word1.substring(5,7));
        System.out.println(word1.substring(8));//fun
        System.out.println(word1.substring(8,11));//fun
        //print: is fun
        System.out.println(word1.substring(5));

    }
}
