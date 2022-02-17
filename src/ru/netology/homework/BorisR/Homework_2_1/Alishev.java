package ru.netology.homework.BorisR.Homework_2_1;

public class Alishev {

    public static void main (String [] Args) {
        AlishevClass auto1 = new AlishevClass("Opel", "Yellow", 2020);
        System.out.println("Model " + auto1.getModel() + " Year " + auto1.getYear() + " Colour " + auto1.getColour());
    }
}
