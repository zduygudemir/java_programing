package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist
        ArrayList<String> cities = new ArrayList<>();

        //add cities to arrayList -> add methods
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4

        //add Ashgabat
        cities.add(0, "Ashgabat");

        //print all values in same line
        System.out.println();

        //print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last cities = " + cities.get(5));

        //find last index size()-1
        System.out.println("last city = " + cities.get(cities.size() - 1));

        //print count of items in arrayList
        System.out.println("count of items = "+ cities.size());

        int size =cities.size();
        System.out.println("there are "+size+" cities in the list");

        //for loop and print all values in same line
        for (int i=0; i<cities.size(); i++){
            System.out.print( cities.get(i)+" ");
        }
        System.out.println();

        for(String city:cities){
            System.out.print(city+" ");
        }

        //delete item arrayList

        //1) remove using index
        cities.remove(3);

        //2) remove using object/value
        cities.remove("New York");

        System.out.println("After remove = "+ cities);

        //delete/remove all value from list
        cities.clear();

        //make sure it is clear
        //1)vprint|spit it out
        System.out.println("cities = "+cities);

        //2) using isEmpty
        if(cities.isEmpty()){
            System.out.println("List is empty");
        }

       //3) check size() == 0
        if (cities.size() == 0){
            System.out.println("List is empty");
        }





    }


}
