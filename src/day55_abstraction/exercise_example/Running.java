package day55_abstraction.exercise_example;

public class Running extends Exercise{//Running is a concede class.it is extending an Abstract

    @Override
    public void perform() {
        System.out.println(" Performing Running exercise");
    }


    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 9;
    }
}
