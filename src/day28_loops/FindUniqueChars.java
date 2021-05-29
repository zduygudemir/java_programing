package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "helloworld";
        String unique = "";
        String unique1 ="";
        for (int i = 0; i < word.length(); i++) {
            if (!unique.contains(word.charAt(i) + "")) {
                unique += word.charAt(i) + "";

            }else{
                unique1 =word.replace(word.substring(i,i+1),"");

            }

        }
        System.out.println("unique word: "+unique);
        System.out.println("unique word2: "+unique1);
    }
}
