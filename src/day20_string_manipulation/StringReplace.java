package day20_string_manipulation;

public class StringReplace {
    public static void main(String[] args){
        String word = "java";
        word.replace("a","u");
        String sentence = ("java string are fun");
        System.out.println(sentence);
        System.out.println((sentence.replace("a","u")));
        System.out.println(sentence.replace("string","conditions"));
        System.out.println(sentence.replace("java",""));

    }

}
