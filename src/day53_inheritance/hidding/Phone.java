package day53_inheritance.hidding;

public class Phone {
    String type = "Old school phone";

    public static void use(){
        System.out.println("Using mobile phone");

    }
    public void call(){
        use();
        System.out.println("and making a phone call");
    }
}
