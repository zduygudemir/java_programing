package day56_abstrzction;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Merhaba");
        System.out.println("Selam");
        System.out.println("Zee");
    }

    @Override
    public void bye() {
        System.out.println("Hoscakal");
        System.out.println("Buaaa");

    }
}
