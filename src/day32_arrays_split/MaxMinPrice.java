package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args){
        String[] items = {"Shoes","Jacket","Gloves","Airpods","ipad","iphone 11 case"};
        double[] price = {99.,     150.0,    9.99,    250.0,   439.50,   39.99 };
        int[] itemsIDs = {12345,    12346,   12347,    12348,  12349,    12350 };
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(price));
        System.out.println(Arrays.toString(itemsIDs));

        System.out.println("most expensive");

        double max = price[0];
        String item = "";

        for(int a=0; a<price.length; a++){
            if(max < price[a]){
            max = price[a];
            item =  items[a]+" indexOf ("+ a +") " +" - $"+price[a]+" - #"+itemsIDs[a];
            }
        }
        System.out.println("max price item is "+item);
        double min = price[0];
        String itemMin = "";

        for(int a=0; a<price.length; a++){
            if(min>price[a]){
               min=price[a];
                itemMin =  items[a]+" indexOf ("+ a +") " +" - $"+price[a]+" - #"+itemsIDs[a];
            }
        }
        System.out.println("min price item is "+itemMin);
    }
}
