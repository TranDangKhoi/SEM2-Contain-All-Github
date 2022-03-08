package ElectricLamp;


public class ElectricLamp {
    private boolean status;
    public ElectricLamp(){
        status = true;
    }

    public boolean getLampStatus(){
        return this.status;
    }

    public void turnOn(){       
         status = true;
    }

    public void turnOff(){
         status = false;
}
}
