package day28_loops;
import java.util.*;

public class RandomPassword {
    public static void main(String[] args){
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password="";

        for(int i = 1; i<= 8; i++){
            int index = random.nextInt(71);// source has 71 character
       // System.out.println(random.nextInt(source.length()));
            System.out.print((source.charAt(index)));
            password+=source.charAt(index);
            //password +=source.substring(index,index+1)


        }
        System.out.println("\n Your pasword is: "+password);



    }
}
