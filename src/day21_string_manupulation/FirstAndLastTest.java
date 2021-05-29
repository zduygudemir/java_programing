package day21_string_manupulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "MOM";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if(first == last){// or if( word.charAt(0) == word.charAt(2))
            System.out.println("first and last letters match  ");
        }else{
            System.out.println("first and last letters mismatch  ");
        }

        String anotherWord = "aziza";
        char firstLetter = anotherWord.charAt(0);
        char lastLetter = anotherWord.charAt(anotherWord.length()-1);

        System.out.println("firstLetter = " +firstLetter);
        System.out.println("lastLetter  = " + lastLetter);

        if (firstLetter == lastLetter){
            System.out.println(anotherWord+ " - first and last match");

        }else{
            System.out.println(anotherWord+ " - first and last mismatch");

        }

    }
}
