package day45_oop;

public class TrafficLightObject
{
    public static void main(String[] args)
    {
       //create traffic light object
       TrafficLight trafficLight = new TrafficLight();
//     These are not good practice that apply for assigning
//       light1.color = "yellow";
//       light1.color = "green";

        //we will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");
        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("red");
        trafficLight2.showColor();
        trafficLight.changeColor("pink");
        trafficLight2.showColor();
    }
}
