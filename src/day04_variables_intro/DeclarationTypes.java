package day04_variables_intro;

public class DeclarationTypes
{
    public static void main(String[]args)
    {
        //declaration + assigment in single statement:

        int bananas=34;
        System.out.println(bananas);

        int students=400;
        System.out.println(students);

        students=401;
        System.out.println(students);

        int peopleInCity, birdsOnTree,fishInLake;
        peopleInCity = 1000;
        fishInLake = 21;
        birdsOnTree = 100;
        System.out.println(peopleInCity);
        System.out.println(fishInLake);
        //color change err
        System.err.println(birdsOnTree);

        int studentsInNY = 58, StudentsInVA = 200;
        System.out.println("studentsInNY = " + studentsInNY);
        System.out.println(StudentsInVA);






    }
}
