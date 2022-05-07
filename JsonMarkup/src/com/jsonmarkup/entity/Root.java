package com.jsonmarkup.entity;

import java.util.List;

public class Root {
    public int id;
    public String name;
    public int cod;
    public String base;
    public int visibility;
    public int dt;
    public int timezone;

    public Coord coord() {
        return null;

    }

    public List<Weather> weather() {
        return null;
    }

    public Main main() {
        return null;
    }

    public Wind wind() {
        return null;
    }

    public Clouds clouds() {
        return null;
    }

    public Sys sys() {
        return null;
    }

}
