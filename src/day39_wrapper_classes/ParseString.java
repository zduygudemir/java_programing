package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args){
        String total ="345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);
        
        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        if(price > 100){
            System.out.println("expensive");
            
        }
        String sentence = "I wrote 857 line of code ";
        String [] s =sentence.split(" ");
        //split by space, parse index 2 to int 
        
        int linesOfCode = Integer.parseInt(s[2]);
        System.out.println("linesOfCode = " + linesOfCode);
        

    }
}
