package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        //!= -> not ture
        System.out.println("!true = "+(!true));
        System.out.println("!false = "+(!false));

        int age = 20;
        // check if age Is NOT more than 7.print "Need to sit in child
        // car seat
         if (!(age > 7)){
             System.out.println(("Need to sit in child car seat"+age));
         }else{
             System.out.println("Can sit normal seat. age +"+age);
         }

         boolean isSmokeAllowed = false;
         if (!isSmokeAllowed){
             System.out.println("Smoking is not allow here. EXIT");
         }
         boolean isAffordable = true;
         // if its not affordable then print"item not a affordable
        if (!(isAffordable)){
            System.out.println("its not affordable then print");


        }
        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("in wrong enviroment for QA testing");
        }
        String carModel = "Tesla";
        //if its not Tesla,print"not intersting, thank you"
        if(!carModel.equals("tesla")){
            System.out.println("Not intersting, Thank you");
        }
        String secretpassword = "abc123";
        String inputPassword = "abc321";

        if (!secretpassword.equals("abc123")){
            System.out.println("incorrect password");
        }
        if (!inputPassword.equals("abc321")){
            System.out.println("incorrect password");
        }
        if(secretpassword.equals("abc123")){
            System.out.println("correct password");
        }
        if (inputPassword.equals("abc321")){
            System.out.println("correct password");
        }

    }
}
