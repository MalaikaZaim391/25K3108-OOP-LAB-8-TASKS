package task5;

public class Main {
    public static void main(String[] args) {

        SmartWashingMachine s = new SmartWashingMachine();
        //cant call start() with interface reference
        //cant call controlRemotely with abstract reference
        //hence using SmartWashingMachine class reference to call both
        s.start();
        s.controlRemotely();

        System.out.println();

        Appliance r = new SmartRefrigerator();
        r.start();


    }

}
