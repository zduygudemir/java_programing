package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//100
        System.out.println(num2);//100

        num1=200;
        System.out.println(num1);//200
        System.out.println(num2);//100

        int n1=55;
        int n2=n1;
        int n3=n2;
        System.out.println(n1);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n1+n2+n3 );

        int IntHirasZipCode=22182;
        int PariyesZipCode=IntHirasZipCode;
        System.out.println(IntHirasZipCode);
        System.out.println(PariyesZipCode);

         IntHirasZipCode=20007;
        System.out.println(IntHirasZipCode);
        System.out.println(PariyesZipCode);

        PariyesZipCode=33131;
        System.out.println(PariyesZipCode);

        System.out.print(1+"\t");
        System.out.println(1);
        System.out.print(2+"\t");
        System.out.println(2);









    }
}
