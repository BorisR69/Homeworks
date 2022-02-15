package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;

public abstract class Event {
    public String title;
    public int releaseYear;
    public int age;

    public Event (String title){
        this.title = title;
    }

    public Event (String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Event (String title, int releaseYear, int age){
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