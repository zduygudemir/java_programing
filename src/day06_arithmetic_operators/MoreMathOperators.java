package day06_arithmetic_operators;

public class MoreMathOperators
{
    public static void main(String[] args)
    {

        int toyotas=431;
        int hondas=233;
        int vw=2;
        int tesla=20;
        int nissan=1;
        int bmw=155;
        // int toyota=431, hondas=233, vw=2,tessla=20,nissan=1,bmw==155; it works
        int totalCarsInParking= toyotas+ hondas+ vw+ tesla+nissan+ bmw;
        System.out.println("Total parking cars = "+totalCarsInParking);
        System.out.println("There are "+totalCarsInParking+" in parking lot.");

        String pizza = "hawaiian";
        int slices = 8;
        int people=4;
        int slicesPerperson = slices/people;
        //There are 2 slices per person
        System.out.println("There are 2 slices "+slicesPerperson+" per person");
        System.out.println(slicesPerperson);
        //we are ordered hawaiian pizza with 8 slices, 4 people ate 2 slices each.
         System.out.println("We are ordered pizza "+pizza+" with "+ slices+", " +
                 ""+people+" people ate "+slicesPerperson+" slices each.");


    }
}
