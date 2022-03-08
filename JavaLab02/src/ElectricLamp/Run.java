package ElectricLamp;

public class Run {
    public static void main(String[] args) {
        SwitchButton mySwitch = new SwitchButton();
        ElectricLamp myLamp = new ElectricLamp();
        mySwitch.connectToLamp(myLamp);
        mySwitch.switchOn();
        System.out.println(myLamp.getLampStatus());
    }
}
