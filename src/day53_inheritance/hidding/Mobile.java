 package day53_inheritance.hidding;

public class Mobile extends Phone {
    String type = "Mobile phone";
   /**method hidding. ...*/

   public static void use(){
        System.out.println("Using mobile phone");
    }
    public void text(){
        use();
        System.out.println("and sending a text message");

    }

    @Override
    public void call(){
        System.out.println("and calling on mobile");
    }



}
