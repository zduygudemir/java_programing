package day48_constructors_static;

public class Bus {
    Engine engine;
    Driver driver;

    public String toString(){
        return driver.getName() + " | "+engine.getCylinders();
    }

}
