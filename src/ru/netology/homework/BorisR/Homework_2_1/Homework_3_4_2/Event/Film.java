package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;

public class Film extends Event{

    public Film (String title) {
        super(title);
    }

    public Film (String title, int releaseYear, int age){
        super(title, releaseYear, age);
    }

    @Override
    public String toString () {
        String eventNew = "Фильм: " + this.title + ". Год создания: " + this.releaseYear +
                ". Возрастные ограничения: " + this.age;
        return eventNew;
    }
}
