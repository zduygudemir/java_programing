package day35_methods_with_param;

public class counters {
    public static void main(String[] args){
        count(5);
        count(7);
        count(2);
        int num2 = 42;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
        printAge(1980);
        int birthYear=2001;
        printAge(birthYear);


    }
    public static void count(int num){
        String countNum = " ";
        for(int i=0; i<=num; i++){
            countNum += i+" ";
        }
        System.out.println("count("+num+")"+countNum+" ");
    }
    public static void printAge(int year){
        int age = 2021-year;
        System.out.println("Birth year: "+year+" Age: "+age);

    }
}
