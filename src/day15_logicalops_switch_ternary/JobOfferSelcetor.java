package day15_logicalops_switch_ternary;

public class JobOfferSelcetor {
    public static void main(String[] args) {

        //location, salary, remote, benefits

        String location = "NY";
        double salary = 120_000.0;
        boolean isremote = true;
        boolean Benefit = true;
        if (location.equals("NY") && salary >= 120_000.0 && isremote && Benefit) {
            System.out.println("Sure, I will accept this offer");
        } else {
            System.out.println("Lets consider another offer or negoriate");
        }

    }
}
