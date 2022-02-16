package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;

public class Theatre extends Event{

    public Theatre (String title) {
        super(title);
    }

    public Theatre (String title, int releaseYear, int age){
        super(title, releaseYear, age);
    }

    @Override
    public String toString () {
        return "Спектакль: " + getTitle() + ". Год создания: " + getReleaseYear() + ". Возрастные ограничения: " +
                getAge();
    }
}
