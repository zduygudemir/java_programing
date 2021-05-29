package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("\n#### WELCOME TO ADAIRE APARTMENTS ####\n");
       int  numberOfBedroom = 5;
        double startingPrice = 0;

        switch (numberOfBedroom){
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice= 1454.0;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice= 1725.0;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899.0;
                break;

            default:
                System.out.println( numberOfBedroom+" bedroom currently unavailable");

                break;
               // return ; exit MAIN METHODE

        }

           System.out.println("Starting price: " + startingPrice);

    }
}
