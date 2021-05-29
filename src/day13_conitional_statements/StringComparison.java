package day13_conitional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("los Angeles")){
            System.out.println("it is LA");
        }else{
            System.out.println("it is not LA");
        }

        String weather = "sunny";
        if(weather.equals("sunny")){
            System.out.println("Lets code today!!!");
        }else{
            System.out.println("just keep calm and keep coding!");
        }
    }
}
