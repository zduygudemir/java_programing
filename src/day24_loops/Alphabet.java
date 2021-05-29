package day24_loops;

public class Alphabet {
    public static void main(String[] args){
        char letter = 'a';
       // System.out.println("letter = "+ letter);
       // letter++;
        System.out.print("letter = ");
        while(letter <= 'z'){
            System.out.print(letter+" ");
            letter++;
        }
        //print Alphabet
        letter = 'z';
        System.out.print("letter = " );
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
        }
            int a =1;
            do {
                System.out.println("apple");
                a++;

            }while (a<=0);
                System.out.println("no apple");




        }
    }

