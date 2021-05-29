package day21_string_manupulation;

public class StringIndexOf {
    public static void main(String[] args) {
                  //   012345
        String word = "github";
        int index = word.indexOf("g");
        System.out.println(index);
        System.out.println(word.indexOf("u"));
        System.out.println(word.indexOf("hub"));
        //it gives first letter index h
        System.out.println(word.indexOf("java"));//-1 not found
    }
}
