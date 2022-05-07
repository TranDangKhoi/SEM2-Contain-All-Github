package com.jsonmarkup.entity;

public class Weather {
    public int id;
    public String main;
    public String description;
    public String icon;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return this.main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
