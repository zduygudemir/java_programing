package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "snack";
        String drink = "tea";
        String snack = "candy";

        if (selection.equals("snack")) {
            System.out.println("snack option  is selected");
            if (snack.equals("candy")) {
                System.out.println("candy item  is selected");

            } else {
                System.out.println("chips item is selected");
            }

        }else if( selection.equals("drink")){
            System.out.println("drink option is selected");
            if(drink.equals("tea")){
                System.out.println("tea option  is selected");
            }else{
                System.out.println("coke option  is selected");
            }
        }
    }
}