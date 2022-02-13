//package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_2.Event;
//
//import java.time.Year;
//
//public class Film extends Event{
//    String filmStudio;
//
//    public Film(String title) {
//        super(title);
//    }
//
//    public Film (String title, Year releaseYear){
//        super(title);
//        super(releaseYear);
//    }
//
//    public Film (String title, Year releaseYear, int age, String filmStudio){
//        super(title);
//        super(releaseYear);
//        super(age);
//        this.filmStudio = filmStudio;
//    }
//
//    @Override
//    public String toString () {
//        String eventNew = "Событие: " + this.title + ". Год создания: " + this.releaseYear + ". Возрастные ограничения: "
//                + this.age;
//        return eventNew;
//    }
//}
