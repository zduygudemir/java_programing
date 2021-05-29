package day37_methods_overloading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String[] WeCanChangeName){
        System.out.println("Hello From Real main method");
        main(3);
        System.out.println(Arrays.toString( WeCanChangeName));
    }

    /**
     * overloading main method:
     * same name + different parameter
     * JDK does not look for this one to run
     */
    public static void main(int num ){
        System.out.println("num "+num);

    }
    public static void main(boolean n){
        System.out.println("n = " + n);
    }

}
