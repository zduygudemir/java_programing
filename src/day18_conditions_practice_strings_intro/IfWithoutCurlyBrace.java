package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBrace {
    public static void main(String[] args) {
        String todaysClass = "pyton";
        if (todaysClass.equals("java"))
            System.out.println(("java is fun"));
        //if only one statement you don't use {after if
        else
            System.out.println("it is not java class. Today  class is "+todaysClass);
//////////////////////////////////////////////////////////////
         int score = 1;
         if(score >0)
             System.out.println("score is  "+score+ " pass");
         else
             if(score==0)
                 System.out.println(("score is  "+score+ " fail"));
             else
                 System.out.println("score is  "+score+"invalid ");
      /////////////////////////////////////////////////////////////
             int a=1;
             if(a ==1)
                 System.out.println("a is 1");//ture
                 System.out.println("1 is a");
                 //if after you not use{ only first print work
                 //output :
                 // a is 1

        int b=1;
        if(b ==1) {
            System.out.println("b is 1");
            System.out.println("1 is b");
        }
    }

}
