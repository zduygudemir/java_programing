package day35_methods_with_param;

import java.util.Locale;

public class buildEmail {
    public static void main(String[] args) {
     email("Zahir","FannieMaeed");
     email("John Ward III","verizon");

    }
    public static void email(String name,String domain){
        System.out.println(name.replace(" ","_").toLowerCase()+"@"+domain.toLowerCase()+".com");

    }
}
