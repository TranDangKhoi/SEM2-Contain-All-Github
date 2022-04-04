package com.examplecar;

public class Race {
    public static void main(String[] args) {
        RacingCar[] raceCars = new RacingCar[5];
        raceCars[0] = new RacingCar(10, "Lambo");
        raceCars[1] = new RacingCar(10, "Mercedes");
        raceCars[2] = new RacingCar(10, "Volvo");
        raceCars[3] = new RacingCar(10, "BMW");
        raceCars[4] = new RacingCar(10, "Mazda");

        for (int i = 0; i < raceCars.length; i++) {
            raceCars[i].start();
        }
    }
}
