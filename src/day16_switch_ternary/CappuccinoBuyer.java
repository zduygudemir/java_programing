package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
         String size  = "tall"; //,"grande","venti";
         double  price = 0.0;
         int calories = 0;

         switch(size ){
             case "tall":
                 System.out.println("Tall Cappuccino please");
                 price = 3.69;
                 calories = 90;
                 System.out.println("price: $"+price);
                 System.out.println("calories: "+calories);
                 break;
             case "grande" :
                 System.out.println("Grande Cappuccino please");
                 price = 3.99;
                 calories = 120;
                 System.out.println("price: $"+price);
                 System.out.println("calories: "+calories);
                 break;
             case "venti":
                 System.out.println("Venti Cappuccino please");
                 price = 4.29;
                 calories = 150;
                 System.out.println(" price: $"+price);
                 System.out.println(" calories: "+calories);
             default:
                 System.out.println("We do not serve that size of Cappuccino");
         }
            System.out.println("Total price : $"+ price );

    }
}
