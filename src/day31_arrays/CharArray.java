package day31_arrays;

public class CharArray {
    public static void main(String[] args){
        char[] letter ={'j','a','v','a',' ','i','s',' ','f','u','n'};
        for(char each : letter){
            System.out.print(each);
        }
        String sentence =new String(letter);// convert char array into String
        System.out.println("\nsentence = "+sentence);

        //CONVERT STRING INTO CHAR ARRAY:
        String item = "wooden spoon";
       //item.toCharArray();
       char[] itemArray = item.toCharArray();
        System.out.println("itemArray.length = "+itemArray.length);
        System.out.println("item.length() = "+ item.length());

        String[] fruits = {"bananas" , "apples", "kiwi", "mango", "papaya", "strawberry"};
        String fruitStr = "";
        for (String each : fruits){
            fruitStr += each+"-";
        }
        System.out.println("\nfruitStr = "+fruitStr);

       String[] languages = {"java","python","c++","sql","ruby","javascript"};
        System.out.println( String.join("|",languages));
        System.out.println( String.join("##",languages));
        String joinedLanguages = String.join(" <> ",languages);
        System.out.println("joinLanguages = "+joinedLanguages);

    }
}
