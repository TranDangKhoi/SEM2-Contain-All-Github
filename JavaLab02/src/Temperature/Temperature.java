package Temperature;

public class Temperature {
    private double cTemp;

    public Temperature(){
        cTemp = 0;
    }

    public Temperature(int cTemp){
       this.cTemp = cTemp;
    }

    public double getCTemp(){
        return this.cTemp;
    }

    public void setCTemp(double cTemp){
        this.cTemp = cTemp;
    }

    public double getFTemp(){
        return cTemp*9/5 + 32;
    }

    public double getKTemp(){
        return cTemp + 273.15;
    }
}
