package Battery;

public class Flash {
    private boolean status;
    private Battery battery;

public Flash(){
    status = false;
}

// Method

public void setBattery(Battery battery){
    this.battery = battery;
}

public int getBatteryInfo(){
    return battery.getEnergy();
}

public void light(){
    if (status==true&&battery!=null&&battery.getEnergy() > 0){
        battery.decreaseEnergy();
    }
}

public void turnOn(){
    if(battery!=null&&battery.getEnergy() > 0){
        status = true;
    }
    light();
}

public void turnOff(){
        status = false;
}
    
}
