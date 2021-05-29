package day_27_loops;

public class ReadStringPortion {
    public static void main(String[] args){

        String list = "cat,car,cat,red_car,java,selenium";

        for(int i = 0; i<list.length()-2; i++){

            System.out.println(list.substring(i,i + 3));

            if(list.substring(i,i + 3).equals("cat") || list.substring(i,i + 3).equals("car") ){

                System.out.println("car or cat found");

                for(int n = 0; n < list.length()-2; n++) {
                    String part = list.substring(n, n + 3);
                    System.out.println("part = " + part);
                    if(part.equals("cat") || part.equals("car")) {
                        System.out.println("cat or car found");
                    }
                }

            }


        }
    }
}
