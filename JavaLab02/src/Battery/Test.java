package Battery;

public class Test {
    public static void main(String[] args) {
        Battery myBattery = new Battery();
        Flash myFlash = new Flash();
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
