package ElectricLamp;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    public SwitchButton(){
        status = true;
    }

    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    
    public void switchOff(){
        status = false;
        lamp.turnOff();
    }

    public void switchOn(){
        status = true;
        lamp.turnOn();
    }
}
