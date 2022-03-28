package com.selfpractice.netflix.model;

public class Movie {
    private int id;
    private String movieName;
    private String movieCategory;
    private String actor;
    private String language;
    private int publishingYear;
    private String publisher;

    public Movie(int id, String movieName, String movieCategory, String actor, String language, int publishingYear,
            String publisher) {
        this.id = id;
        this.movieName = movieName;
        this.movieCategory = movieCategory;
        this.actor = actor;
        this.language = language;
        this.publishingYear = publishingYear;
        this.publisher = publisher;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieCategory() {
        return this.movieCategory;
    }

    public void setMovieCategory(String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public String getActor() {
        return this.actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return id + ". " + movieName;
    }

}
