package day06_arithmetic_operators;

public class CarDriveInfo
{
    public static void main(String[] args)
    {
        String carModel="Toyota";
        String driverName="Zahir Duygu Demir";
        String licenseNum="D224698247218";
        short speed=55;
        boolean isautomatic=true;
        char licenseClass='D';
        System.out.println("Car model :\t\t\t"+carModel);
        System.out.println("Driver name :\t\t"+driverName);
        System.out.println("License number:\t\t"+licenseNum);
        System.out.println("Is automatic:\t\t"+isautomatic);
        System.out.println("Current speed:\t\t"+speed+"mph");
        System.out.println("License :\t\t\t"+licenseClass);
        System.out.println();
        System.out.println("****************************");
        System.err.println("*****************************");
        System.out.println(carModel+" is car model");
        System.out.println(driverName+" is driving white "+carModel+".");
        //numeric number and variable to getter  1+ ""+2
        System.out.println(carModel +" "+ speed);
        System.out.println(1+", "+2+", "+3+"' "+4+", ");
        boolean b1=true;
        boolean b2=false;
       // System.out.println(b1+b2);
        //it is not work because of boolean
        System.out.println("b1"+b2);
        String Name= "Zahir";
        String lastname= "Duygu";
        // to string you can use +
        System.out.println(Name + lastname);
        System.out.println();




    }
}
