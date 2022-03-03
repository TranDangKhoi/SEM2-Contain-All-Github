package Battery;

public class Battery {
    private int energy;

    // Constructor
    public Battery(){
        energy = 100;
    }
    // Method
    public void setEnergy(int value){
        this.energy = value;
    }

    public int getEnergy(){
        return this.energy;
    }

    public void decreaseEnergy(){
        energy--;
    }

    public void printBattery(){
        System.out.printf("Battery: %d",energy);
    }
    
}
