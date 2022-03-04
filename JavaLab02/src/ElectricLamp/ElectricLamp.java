package ElectricLamp;

public class ElectricLamp {
    private boolean status;
    public ElectricLamp(){

    }

    public boolean getStatus(){
        return this.status;
    }

    public void turnOn(){
        if(switchOn() == true){
            status = true;
        }
    }

    public void turnOff(){
        if(switchOff() == true){
            status = false;
        }
    }
}
