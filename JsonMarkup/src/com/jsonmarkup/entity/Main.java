package com.jsonmarkup.entity;

public class Main {
    public int temp;
    public double feels_like;
    public int temp_min;
    public int temp_max;
    public int pressure;
    public int humidity;
    public int sea_level;
    public int grnd_level;

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return this.feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public int getTemp_min() {
        return this.temp_min;
    }

    public void setTemp_min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_max() {
        return this.temp_max;
    }

    public void setTemp_max(int temp_max) {
        this.temp_max = temp_max;
    }

    public int getPressure() {
        return this.pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return this.humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getSea_level() {
        return this.sea_level;
    }

    public void setSea_level(int sea_level) {
        this.sea_level = sea_level;
    }

    public int getGrnd_level() {
        return this.grnd_level;
    }

    public void setGrnd_level(int grnd_level) {
        this.grnd_level = grnd_level;
    }
}
