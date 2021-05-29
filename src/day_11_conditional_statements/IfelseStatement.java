package day_11_conditional_statements;

public class IfelseStatement {
    public static void main(String[] args) {
        if(10>5){
            System.out.println("condition is true ");

        }else{
            System.out.println("condition is false ");

        }
        int count = 25;
        //check if count is more than 30. if yes, print "count is more than 30
         if(count>30){
             System.out.println("count is more than 30");

         }else{
             System.out.println("count is less than 30");
             byte age =8;
             if(age>=18){
                 System.out.println("Your are eligible to vote");
                 System.out.println("age is greater or equal to 18 ");

             }else{
                 System.out.println("not eligible to vote \n age is less than 18");
             }
         }



    }
}
