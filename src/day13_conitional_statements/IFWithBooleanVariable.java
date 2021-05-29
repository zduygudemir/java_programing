package day13_conitional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] arg){
        boolean isHungry = true;
        System.out.println();


        if (isHungry) {
            System.out.println("I am hungry i will go get somthing to eat\n" +
                    "Then code java");

        }else{
            System.out.println("I am not hungry, Lets keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = 200 > price ;

        if(isAffordable){
            System.out.println("I can afford it, lets buy!");
        }else{
            System.out.println("Too expencive,lets keep coding java");
        }
         boolean isRemoteJob = true;
        //if (isRemoteJob != true or
        //if (isRemotejob == false or
        if ( ! isRemoteJob){
            System.out.println("Sorry Iam not interested");
        }else{
            System.out.println("Sure,I am interested, what is interview process");
        }

    }
}
