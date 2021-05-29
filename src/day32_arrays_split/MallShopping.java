package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args){
        String[] items = {"Shoes","Jacket","Gloves","Airpods","ipad","iphone 11 case"};
        double[] price = {99.,     150.0,    9.99,    250.0,   439.50,   39.99 };
        int[] itemsIDs = {12345,    12346,   12347,    12348,  12349,    12350 };
        System.out.println("\n---------FIND THE FIRST INDEX OF 'GLOVES' IN THE ITEMS ARRAY");
        String search ="Gloves";
        for(int i=1; i<items.length; i++){
            if(items[i].equalsIgnoreCase(search) ){
                System.out.println(search +" found at index "+i );
                break;
               // System.out.println(i+" - "+items[i]);
            }
        }
            System.out.println("\n------Set boolean to true if first 'ipad' in items array---- ");
            boolean ipadExists = false;
            for(String item : items){
                if(item.equalsIgnoreCase("iPad")){
                ipadExists = true;
                break;
                }
            }
            System.out.println("iPadExists " +ipadExists);

            if(ipadExists){
                System.out.println("we buy the iPad!");

            } else {
                System.out.println("we forgot the iPad!");
            }
        System.out.println("====Print a report of each shopping  item ========");
            for(int i=0; i<items.length; i++){
                System.out.println(i+1 +":  "+items[i]+" - $"+price[i]+" - #"+itemsIDs[i]);
            }
        System.out.println("======Look for 'Jacket' in items and print all details ");

            for(int a=0; a<items.length; a++){
                if (items[a].equals("Jacket")){
                    System.out.println(items[a]+" - $"+price[a]+" - #"+itemsIDs[a]);
                    break;
                }
            }




    }
}
