package com.productjsondemo.model;

import java.util.List;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.productjsondemo.entity.Product;

public class Repository {
    public List<Product> products;

    public List<Product> getData() {
        try {
            FileReader reader = new FileReader("products.json");

            // Dung thu vien GSON - chuyen tu JSON text -> object
            Type objectType = new TypeToken<List<Product>>() {
            }.getType();
            products = new Gson().fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
