package day04_variables_intro;

public class AmazonItem
{
    public static void main(String[] args)
    {
        String description = "HIC wooden spoon ";
        int ratingCourt =181;
        double price = 5.99;
        String seller = "amazon.com";
        boolean prime = true;
        //String prime= "true";
        System.out.println("----PRODUCT INFORMATION----");
        System.out.println(description);
        System.out.print("* * * * *");
        System.out.println(ratingCourt );
        System.out.println("$"+price);
        System.out.println(seller);
        System.out.println(prime );


    }
}
