//smart washing machine supports remote control too
//implements both abstract and interface

package task5;

public class SmartWashingMachine extends Appliance implements RemoteControl {

    @Override
    public void controlRemotely() {
        System.out.println("Smart Washing Machine supports Remote Control");
    }

    @Override
    public void start(){
        System.out.println("Starting Smart Washing Machine...");
    }


}
