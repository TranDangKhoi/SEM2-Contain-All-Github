package Battery;

public class Test {
    public static void main(String[] args) {
        Battery myBattery = new Battery(); // Object (Mua pin)
        Flash myFlash = new Flash(); // Object (Mua flashlight)
        myFlash.setBattery(myBattery);
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        myFlash.turnOn();
        myFlash.turnOff();
        System.out.println(myFlash.getBatteryInfo());
    }
}
