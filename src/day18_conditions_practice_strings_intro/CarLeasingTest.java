package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String Make = "toyota";
       String model = "A";
        double leasePrice = 0.0;

        if (Make.equals("Mercedes")){
            if (model.equals("A")){
                leasePrice =400 ;

            }else if(model.equals("E")){
                leasePrice = 500.0;
            }
        }else if (Make.equals("Audi")) {
            if (model.equals("A3")) {
                leasePrice = 600;

            } else if (model.equals("SQ5")) {
                leasePrice = 552.0;
            }
        }else{
            System.out.println("invalid make");
        }
            System.out.println("make = "+Make);
            System.out.println("model = "+model);
            System.out.println(("lease price is = "+leasePrice));
    }
}
