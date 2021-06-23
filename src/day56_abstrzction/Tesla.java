package day56_abstrzction;

public class Tesla extends Transportation{
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("tesla costs "+(mile * 0.10)+ "to drive "+mile +" miles");

    }
}
