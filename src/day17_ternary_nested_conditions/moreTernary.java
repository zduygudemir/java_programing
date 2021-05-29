package day17_ternary_nested_conditions;

public class moreTernary {

    public static void main(String[] args) {
        int hourlyRate = 50;
     // String reply;
    //    if (hourlyRate > 45 ){
     //       reply = "accept";
     //   }else {
      //      reply = "reject";

       // }
        String reply = (hourlyRate> 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);
        String todayClass = "java";
        String teacher = (todayClass.equals("java")) ? "Saim|Muradil" : "Nadir";
        System.out.println("Today's teacher"+teacher);

        boolean isEligibleToDrive = true;
        String driving =(isEligibleToDrive) ? "have Dl, an Can drive" :
                "No Dl, cannot drive ";
        System.out.println(driving);
        //"have Dl an Can drive"


    }

}
