package day29_nestedloop_arrays;

public class StringNestedLoop {
    public static void main(String[] args){
        String word = "java";
        int count=0;
        for (int i=0; i<word.length(); i++){

            for (int j=0; j<=i; j++){
                System.out.println(word.charAt(j));

            }
            System.out.println();


        }
        /**java
         * ava
         * va
         * a
         */
        System.out.println("==================");
        for (int i=0; i<word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.println((word.charAt(j)));
            }
            System.out.println();
        }

    }
}
