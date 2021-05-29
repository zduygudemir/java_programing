package day29_nestedloop_arrays;

public class nestedForLoop {
    public static void main(String[] args){
        for(int hours=1; hours<=4; hours++){
         System.out.println("\nhour = "+hours);
          for(int minutes =1; minutes<=60; minutes++){
            System.out.println("\nminute = "+ minutes);
            for(int seconds =1; seconds<=60; seconds++){
                System.out.print(seconds+" ");

            }
          }
        }
        for (int min = 0; min<=59; min++) {
            for(int sec= 0; sec<=59; sec++){
                System.out.println(min+ " : "+sec);
            }
        }
    }
}
