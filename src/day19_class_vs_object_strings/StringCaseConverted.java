package day19_class_vs_object_strings;

public class StringCaseConverted {
    public static void main(String[] args) {
        String word = "bunny";
        String sentence ="123 Java Is Fun!";
        System.out.println(word);
        //converst word to all Lowercase
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        //change word to all lowercase letter. and assign back
        word = word.toLowerCase();
        System.out.println("word = "+word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - "+company.toUpperCase());
        System.out.println("java".toUpperCase());
        //change variable company "Amazon" to "AMAZON"
        System.out.println("compmany = "+company);
        company = company.toUpperCase();
        System.out.println(company);


    }
}
