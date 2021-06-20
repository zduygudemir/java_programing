package day11_comperation_operators;

public class CompareChars {
    public static void main(String[] args){
        char letter1,letter2;
        letter1 = 'G';
        letter2 = 'W';
        System.out.println("letter1 = "+letter1+" letter2 = "+letter2);
        System.out.println(letter1==letter2);
        System.out.println(letter1>letter2);
        System.out.println(letter1<letter2);

        char grade = 'E';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass the exam? - "+ pass);
    }

}
