package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C' ||
                grade == 'a' || grade == 'b' || grade == 'c') {
            System.out.println("Passe. with grade " + grade);
        } else if (grade == 'D' || grade == 'd') {
            System.out.println("Qualify for retake. Grade " + grade);
        } else if (grade == 'E' || grade == 'e') {
            System.out.println("Fail.  Grade " + grade);
        } else {
            System.out.println("invalid Grade " + grade);
        }

    }

}
