package day29_nestedloop_arrays;

public class multiplicationTable {
    public static void main(String[] args){
        for (int i = 1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
        for (int row=1; row<=4; row++){
            for (int col=1; col<=4; col++){
                System.out.println(row+" | "+col);
            }
        }
        String word="java";
        for (int i=0; i<word.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.println(word.charAt(j));
            }
            System.out.println();
        }
    }
}
