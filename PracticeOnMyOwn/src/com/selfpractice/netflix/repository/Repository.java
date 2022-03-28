package com.selfpractice.netflix.repository;

import java.util.List;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.selfpractice.netflix.Movie;

public class Repository {
    public List<Movie> Movies;

    public List<Movie> getData() {
        try {
            FileReader reader = new FileReader("netflixmovie.json");

            // Dung thu vien GSON - chuyen tu JSON text -> object
            Type objectType = new TypeToken<List<Movie>>() {
            }.getType();
            Movies = new Gson().fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return Movies;
    }
}