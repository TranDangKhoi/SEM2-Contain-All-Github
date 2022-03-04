package Temperature;

public class Run {
    public static void main(String[] args) {
        Temperature myTemp = new Temperature(25);
        System.out.println("F Temp = " + myTemp.getFTemp());
        System.out.println("K Temp = " + myTemp.getKTemp());
    }
}
