package com.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        MapExample.demoMap();
        Employee employee1 = new Employee(1, "Nguyen Thi Huyen Song", "090000", "huyensong123@gmail.com");
        Employee employee2 = new Employee(2, "Nguyen Gia Binh", "09320", "giabinh123@gmail.com");
        Employee employee3 = new Employee(3, "Nguyen Thi Chanh", "093421", "thichanh123@gmail.com");
        Employee employee4 = new Employee(4, "Nguyen Thi Thanh", "083212", "thithanh123@gmail.com");
        // Khoi tao map
        Map<Integer, Employee> map = new HashMap<Integer, Employee>();
        // dua du lieu vao
        map.put(employee1.getId(), employee1);
        map.put(employee2.getId(), employee2);
        map.put(employee3.getId(), employee3);
        map.put(employee4.getId(), employee4);

        // show map using keySet()

        for (Integer key : map.keySet()) {
            Employee value = map.get(key); // value = Employee
            System.out.println(key + " - " + value);
        }

    }
}
