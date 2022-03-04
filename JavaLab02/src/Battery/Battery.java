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

    // Khai báo và thiết lập một object Battery.
    // Khai báo và thiết lập một object Flash.
    // Gắn battery vào trong flash.
    // Bật và tắt đèn pin 10 lần
    // Hiển thị số pin còn lại trong đèn pin

}
