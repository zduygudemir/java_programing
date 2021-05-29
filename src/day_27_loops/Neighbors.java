package day_27_loops;

public class Neighbors {
    public static void main(String[] args){
        String word = "jaaavvaajjacbtreproohlln";

        for (int i =0; i<word.length()-1; i++){
            //if(word.substring(0,i).equals(word.substring(i,i+1))
            System.out.print((word.charAt(i)));
            System.out.println(word.charAt(i+1));
            if (word.charAt(i) == word.charAt(i+1)){
                System.out.println(("beep - "+word.charAt(i)));
            }

        }
    }
}
