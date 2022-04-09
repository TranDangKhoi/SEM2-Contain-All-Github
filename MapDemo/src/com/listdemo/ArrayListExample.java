package com.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void methodArrayList() {
        // Cach 1:
        ArrayList<String> animals = new ArrayList<>();

        // Cach 2:
        List<String> cars = new ArrayList<>();

        animals.add("cat");
        animals.add("pig");
        animals.add("buffalo");
        animals.add("dog");

        System.out.println(animals);
        animals.add(3, "horse");
        System.out.println(animals);
        // get size of ArrayList
        int size = animals.size();
        System.out.println("Kich thuc cua ArrayList animals: " + size);
        // Dung forearch de show thong tin cua ArrayList
        for (String arr : animals) {
            System.out.println(arr);
        }
        // Lay ra 1 phan tu bat ki
        System.out.println("Phan tu co index = 4: " + animals.get(4));

        // Update
        animals.set(3, "lion");
        System.out.println("After update: ");
        show(animals);
        // delete
        animals.remove("lion"); // theo element
        animals.remove(1); // theo index
        System.out.println("After delete: ");
        show(animals);
        // delete all
        animals.clear();
        size = animals.size();
        System.out.println("After delete all: " + size);
    }

    public static void show(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        methodArrayList();
    }
}
