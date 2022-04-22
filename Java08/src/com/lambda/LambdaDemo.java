package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo {

    public static void Demo() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(1);
        numbers.add(54);
        numbers.forEach((myNum) -> {
            System.out.println(myNum);
        });

    }

    public static void main(String[] args) {
        LambdaDemo.Demo();
    }
}
