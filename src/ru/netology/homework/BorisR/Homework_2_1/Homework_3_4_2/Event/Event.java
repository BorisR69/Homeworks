package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;

public abstract class Event {
    private String title;
    private int releaseYear;
    private int age;

    public Event (int releaseYear){
        this.releaseYear = releaseYear;
    }

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
        return "Событие: " + this.title + ". Год создания: "+ this.releaseYear + ". Возрастные ограничения: " + this.age;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getAge() {
        return age;
    }
}
