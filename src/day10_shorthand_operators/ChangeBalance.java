package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[]args){
        double   balance=1230.55;
        System.out.println("balance = $" + balance);
        double baklava = 22.50;
        System.out.println("baklava = $" + baklava);
        //decrease balance by baklava;
        balance = balance-baklava;
        System.out.println("balance after baklava = $" + balance);
        double kunefe = 44.55;
        balance = balance - kunefe;
        System.out.println("balance after  kunefe = $"+balance);
        kunefe = kunefe*0.5;
        System.out.println("kunefe = $" + kunefe);
        balance=balance-kunefe;
        System.out.println("balance after %50 discount of kunefe = $"+balance);

        double plov = 7.99;
        System.out.println("plov = $"+plov);
        balance=balance-plov;
        System.out.println("balance after plov = $"+balance);

        double icedtea = 3.0;
        System.out.println("Icedtea = "+icedtea);
        balance=balance-icedtea*4;
        System.out.println("balance after 4 icedtea = $"+balance);
        //return baklava
        System.out.println("retuning baklava = $"+baklava);
        balance=balance+baklava;
        System.out.println("balance after return baklava  = $"+balance);



    }
}
