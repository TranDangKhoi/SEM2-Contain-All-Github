package com.selfpractice.authenticationbank;

import java.util.List;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Repository {
    public List<User> users;

    public List<User> getData() {
        try {
            FileReader reader = new FileReader("bankuser.json");

            // Dung thu vien GSON - chuyen tu JSON text -> object
            Type objectType = new TypeToken<List<User>>() {
            }.getType();
            users = new Gson().fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }
}
