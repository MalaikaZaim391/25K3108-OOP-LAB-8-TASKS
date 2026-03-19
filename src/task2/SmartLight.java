package task2;

public class SmartLight implements SmartDevice {

    @Override
    public void turnOn(){
        System.out.println("Smart Light turned on");
    }
    @Override
    public void turnOff(){
        System.out.println("Smart Light turned off");
    }


}
