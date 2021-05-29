package day23_string_manupulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String  word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove spaces first then print everything uppercase
        System.out.println(word.replace(" ","").toLowerCase());
        String city = "chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = "+ capitalized);
        System.out.println(city.substring(1,5).toUpperCase().charAt(3));

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

    }

}
