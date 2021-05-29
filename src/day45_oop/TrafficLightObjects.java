package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";NOT THIS WAY
        //we will assign/update the value of color
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();
        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = "black";
        trafficLight2.showColor();

    }
}
