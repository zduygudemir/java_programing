package day29_nestedloop_arrays;

public class countCharNestedLoop {
    public static void main(String[] args){
        String word = "hello1";
        String word1="";


        for(int i=0; i<word.length(); i++){
            System.out.println("outer: "+word.charAt(i));
            int count = 0;
            for(int j=0; j<word.length(); j++){
                if (word.charAt(i)==word.charAt(j)){
                    count++;
                }
                if (count>1){
                   word1=word.charAt(i)+" duplicates "+count+" time"+"\n";
                }
            }

            System.out.println(""+word.charAt(i)+" = "+count);
        }
        System.out.println(word1);


    }
}
