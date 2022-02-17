package ru.netology.homework.BorisR.Homework_2_1;

import javax.management.loading.PrivateClassLoader;

public class AlishevClass {
    private String model;
    private String colour;
    private int year;

    public AlishevClass(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
