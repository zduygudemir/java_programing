package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args){
        String city = "Boston";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to "+city);
        }else{
            System.out.println("Not considering Seattle"+city);

        }
        //Saim or Muradil -> it is a java class with Saim
        //otherwise -> Soft skill class with Nadir
        String teacher ="Nadir";

        if(teacher.equals("Muradil") || teacher.equals("Saim")){
            System.out.println("It is a java class with  "+teacher);

        }else {
            System.out.println("Soft skill classes with "+teacher);
        }
        //1- teacher Saim or Muradil-> it is a java class
        //2- teacher Nadir soft skill class with
        // any other teacher-> Some class with Gurhan/Akbar

        if (teacher.equals("Muradil") || teacher.equals("Saim")){
            System.out.println("it is java class with "+teacher);

        }else if(teacher.equals("Nadir")){
            System.out.println("soft skill class with "+teacher);
        }else{
            System.out.println("Same class with "+ teacher);

        }
        //company - "Google", salary>= 100k
         String company= "Google";
        double salary=85_000.0;
        if (company.equals("Google") || salary>=100_000) {
            System.out.println("I accept offer "+company);
        }else{
            System.out.println("rejecting offer from "+ company);
        }

    }
}
