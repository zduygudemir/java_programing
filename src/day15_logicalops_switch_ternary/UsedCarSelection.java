package day15_logicalops_switch_ternary;

public class UsedCarSelection {
    public static void main(String[] args) {
        double budget = 5000;
        String model="Tesla";
        double carPrice=8999.0;
        if ( budget >= carPrice  && (model.equals("Toyota")|| model.equals("Honda")
                || model.equals("Tesla") )){
            System.out.println("Ready to purchase model = "
                    +model+", price = "+carPrice);
        }else {
            System.out.println("Not intereted in model =  " +model+", price = "+carPrice);
        }

        }
}
