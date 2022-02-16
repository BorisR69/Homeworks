package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event.*;

public class Main {

    public static void main(String[] args) throws EventRuntimeException {
        for (Event event: getMovies()) {
            validEvent(event);
        }
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Film[] getMovies() {
        return new Film[]{
                new Film("Billions",2019, 16),
                new Film("Snowpricer"),
                new Film("A Discovery of Witches", 2019, 18),
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 16),
                new Theatre("Преступление и наказание", 2010, 18),
                new Theatre("Идиот"),
        };
    }

    public static void validEvent(Event event) throws EventRuntimeException {
        if (event.getTitle() == null || event.getReleaseYear() == 0 || event.getAge() == 0){
            System.out.println(event);
            throw new EventRuntimeException("Не все поля заполнены!");
        }
    }
}


