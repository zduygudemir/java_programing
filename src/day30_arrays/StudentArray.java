package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "234345445";
        student1[1] = "Zahir";
        student1[2] = "Demir";
        student1[3] = "B22";
        student1[4] = "973-424-5678";

        String[] student2 = {"234345445", "Zahir", "Demir", "B22", "973-424-5678"};

        System.out.println("student id =     " + student2[0]);
        System.out.println("student firstname =" + student2[1]);
        System.out.println("student last name = " + student2[2]);
        System.out.println("student batch number = " + student2[3]);
        System.out.println("student phone number " + student2[4]);

        System.out.println("stdent data length: " + student2.length);

        if (student1.length == 5) {
            System.out.println(("Pass: data arrays length match"));
        } else {
            System.out.println("Fail: data arrays length mimatch");

        }
        if (student1.length == student2.length) {
            System.out.println(("Pass: data array has correct length"));
        } else {
            System.out.println("Fail: data array has incorrect length");




        }
        System.out.println(student1[1].toUpperCase()+"\t"+student1[2].toUpperCase());
        System.out.println((student1[1]+" "+student1[2]).toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());


    }

}
