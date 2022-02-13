package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;

import java.time.Year;

public abstract class Event {
    public String title;
    public Year releaseYear;
    public int age;

    public Event (String title){
        this.title = title;
    }

    public Event (String title, Year releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Event (String title, Year releaseYear, int age){
        this.title = title;
        this.releaseYear = releaseYear;
        this.age = age;
    }

    @Override
    public String toString (){
        String eventNew = "Событие: " + this.title + ". Год создания: "+ this.releaseYear + ". Возрастные ограничения: "
                + this.age;
        return eventNew;
    }



}
