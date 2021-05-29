package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args){
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: "+word.length());


        String name = "Nadir";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println("wooden spoon".length());

        String firstName = "Zahir";
        System.out.println(firstName + "-"+firstName.length());
        int count = firstName.length();// length return int value
        System.out.println("count = "+count);

        String password = "abc123";
        // if statement : when password is at least 6 character
        //print: valid amazon password
        //else
        //password too short
        if (password.length()>=6){
            System.out.println("valid amazon password");

        }else{
            System.out.println("password too short");
        }


    }
}
