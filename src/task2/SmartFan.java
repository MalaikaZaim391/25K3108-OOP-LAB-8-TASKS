package task2;

public class SmartFan implements SmartDevice {

    @Override
    public void turnOn(){
        System.out.println("Smart Fan turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Smart Fan turned off");
    }


}
