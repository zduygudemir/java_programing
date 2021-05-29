package day21_string_manupulation;

public class ReplacePractice { // class name  is also file name
    public static void main(String[] args){
        String word = "Github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = "+word);
        word = word.replace("hub","lab");
        System.out.println("word = " + word);
        //i->o a->i
        System.out.println(word.replace('i','o').replace('a','i'));
        String sentence ="java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println(withNoSpace );
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println( "sentence = " +sentence);
        String result = "1-48 of over 4,000 results for \"java book\"";

        // result = result.replace("1-48 of over 4,000 results for \"java book\"","4000");
        result = result.replace("1-48 of over","")
                .replace(",","")
                .replace("results for \"java book\"","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
          count++;
        if (count > 0) {
            System.out.println("Search success");
        }

    }
}
