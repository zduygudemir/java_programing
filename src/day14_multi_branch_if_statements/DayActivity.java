package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args){
        String weather ="Sunny";
        if (weather.equals("Sunny")){
            System.out.println("- Go to park, hiking, and code java");
        }else if(weather.equals("rainy")){
            System.out.println("- Stay at home,drink tea, and code java");
        }else if(weather.equals("snowy")){
            System.out.println("- clean the car and build snowman, drink hot chocolate, and code java");

        }else if (weather.equals("windy")){
            System.out.println("- Get ready for power los,fly a kite, and code java");
        }else {
            System.out.println("just keep  coding java");
        }
    }
}
