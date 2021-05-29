package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(12);
        displayValue(94);
        int count =67;
        displayValue(count);
        greetByName("Saim");
        greetByName("Muradil");
        String name = "Suleyman";
        greetByName(name);

    }
    public static void displayValue(int num){
        System.out.println("value is "+num);


    }
    public static void greetByName(String name){
        System.out.println("Hello "+name+", how are you today?");

    }
}
