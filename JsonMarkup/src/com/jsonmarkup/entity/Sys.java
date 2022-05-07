package com.jsonmarkup.entity;

public class Sys {
    public int type;
    public int id;
    public String country;
    public int sunrise;
    public int sunset;

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public int getSunset() {
        return this.sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }
}
