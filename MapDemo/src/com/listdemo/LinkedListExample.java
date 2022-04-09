package com.listdemo;

import java.util.LinkedList;

import javax.lang.model.element.AnnotationMirror;

public class LinkedListExample {
    public void methodLinkedList() {
        LinkedList<String> cars = new LinkedList<>();
        // add more elements 
        cars.add("BMW");
        cars.add("Vinfast");
        cars.add("Toyota");
        cars.add("Ford");
        System.out.println("List of cars: ");
        show(cars);

        cars.add(2, "Audi");
        System.out.println("After adding elements with index = 2: ");
        show(cars);

        cars.addFirst("Hyundai");
        cars.addLast("Volvo");
        System.out.println("After add First and Last:");
        show(cars);

        int size = cars.size();
        System.out.println("Size of LinkedList: " + size);

        // get by index
        System.out.println("Phan tu co index = 1:" + cars.get(1));
        System.out.println("Phan tu dau tien: " + cars.getFirst());
        System.out.println("Phan tu cuoi cung: " + cars.getLast());
        // update
        cars.set(3, "Chevrolet");
        System.out.println("After update with set: ");
        show(cars);

        // return to the first element
        System.out.println("Poll back the first element: " + cars.poll());
        System.out.println("After delete the first element");
        cars.clear();
        System.out.println("Size after deleting all: " + cars.size());
    }

    public void show(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}