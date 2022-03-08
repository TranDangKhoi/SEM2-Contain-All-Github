package ElectricLamp;

public class Run {
    public static void main(String[] args) {
        SwitchButton mySwitch = new SwitchButton();
        ElectricLamp myLamp = new ElectricLamp();
        mySwitch.connectToLamp(myLamp);
        mySwitch.switchOff();
        System.out.println("The switch button status is now: " + mySwitch.getSwitchStatus());
        System.out.println("The electric lamp status is now: " + myLamp.getLampStatus());
        
    }
}
