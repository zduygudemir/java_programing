package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score=90;
        String quality= "goood";
        String result = (score>60) ? "pass" : "fail";
        String evenodd = (score%2 == 0) ? "even" : "odd";
        char grade = (score>90) ? 'A' : 'B';
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("resault = "+result);
        System.out.println("evenodd ="+ evenodd);
        System.out.println("grade ="+grade);

        int score1 = 75;
        String result1;
        if (score1>60){
            result1 = "Pass";

        }else{
            result1 = "Fail";
        }
        System.out.println("result1 = "+result1);

        //WITH TERNARY
        int score2 = 88;
        String result2 = (score1 > 60) ? "Pass" : "Fail";
        System.out.println("result = "+result2);

        System.out.println("bunny ");


    }
}
