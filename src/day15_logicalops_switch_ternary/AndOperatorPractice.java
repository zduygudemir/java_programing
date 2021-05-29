package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args){
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden Spoon";

        if (onSale && freeShipping){
            System.out.println("adding to cart - "+itemName);

        }else{
            System.out.println(" continue shopping good deals on -"+itemName);
        }
        //add to cart only when it  is freeShipping and onSale


   }
}
