package ElectricLamp;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;
    public SwitchButton(){
        
    }

    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }
    
    public void switchOff(){
        status = false;
    }

    public void switchOn(){
        if(lamp.getStatus() == true)
        status = true;
    }
}
