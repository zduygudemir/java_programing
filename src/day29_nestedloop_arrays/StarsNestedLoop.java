package day29_nestedloop_arrays;

public class StarsNestedLoop {
    public static void main(String[]args){
        for (int i =1; i<=5; i++){
            for(int j=1; j<=10; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int a=1; a<=10; a++){
            for (int b = 1; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int x=1; x<=10; x++){
            for(int y =9; y>=x; y--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
