package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args){
        double[] prices = {22.34, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        //print all numbers from array are more than 100
        for(double eachPrice :prices){
            if (eachPrice > 100){
                System.out.print(eachPrice+" ");
            }
        }
        System.out.println("\n---prices between 10 and 70---");
        for(double between10And70 : prices){
            if(between10And70 >=10 &&  between10And70 <= 70){
                System.out.print(between10And70+" ");

            }
        }
        System.out.println("-----count the prices that are more than 50------");
        int count=0;
        for (double more50 :prices ){
            if(more50 > 50 ){
                count++;
            }
        }
        System.out.println("count = "+count);
        System.out.println(("\n-----countries with name length more than 7- inclusive"));
        for(String country : countries ){
            if(country.length() >= 7 ){
                System.out.println(country+"-"+country.length()+" ");
            }
        }








    }
}
