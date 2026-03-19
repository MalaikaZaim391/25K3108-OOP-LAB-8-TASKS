package task2;

public class Main {
    public static void main(String[] args) {

        SmartDevice smartLight = new SmartLight();
        SmartDevice smartFan = new SmartFan();

        smartLight.turnOn();
        smartFan.turnOn();

        System.out.println();

        smartLight.turnOff();
        smartFan.turnOff();

    }
}
