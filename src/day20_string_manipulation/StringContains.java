package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args){
        String company ="Capital one";
        System.out.println(company.contains("a"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));
        System.out.println(company.contains("One"));
        // if company space, print "multiple words company name"
        //else "single word company name

        if (company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | " is i etsyTitle
        if (etsyTitle.contains(" | ")){
            System.out.println(("pass - title check passed"));
        }else{
            System.out.println(("Fail - title check failed"));
        }

        String firstName = "Ahmed";
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println(("Both a and e are present"));

        }else{
            System.out.println("a || e not present");
        }
         firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("e")){

        }
        String email ="melekceylin@hotmail.com";
         if (email.contains("@") && email.endsWith(".com")){
             System.out.println("valid email address");
         }else{
             System.out.println("invalid email");

         }
         if (email.toLowerCase().contains("d")){
             System.out.println("d is present");
         }else{
             System.out.println("d is not present");
         }



    }
}
