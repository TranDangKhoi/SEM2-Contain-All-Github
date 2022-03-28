package com.selfpractice.netflix.controller;

import com.selfpractice.netflix.model.*;
import com.selfpractice.netflix.repository.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Controller {
    Repository repo = new Repository();
    List<Movie> list = repo.getData();

    public void showAll() {

    }

    public void sortAndShow() {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return 0;
            }
        });
    }

    public void searchByName(List<Movie> list, String movieName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMovieName().toLowerCase().contains(movieName))
                System.out.println(list.get(i));
        }
    }

    public void searchByCategory(List<Movie> list, String movieCategory) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getMovieCategory().contains(movieCategory);
        }
    }

    public void searchByLanguage(List<Movie> list, String language) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).getLanguage().contains(language);
        }
    }

    public void showAllByCategory() {

    }
}
