package day19_class_vs_object_strings;

public class CheckCaseMatch {
    public static void main(String[]args){
        String countryCode = "USA";
       /* if (countryCode.equals("UK")){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }*/
          // with uppercase
        if (countryCode.equals(countryCode.toUpperCase())){
            System.out.println("country = "+countryCode );
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }


        String word = "UK";
        String uWord = word.toUpperCase();
        if (word.equals(uWord)){
            System.out.println(word == uWord);
        }else{
            System.out.println(word != uWord);
        }
    }

}
