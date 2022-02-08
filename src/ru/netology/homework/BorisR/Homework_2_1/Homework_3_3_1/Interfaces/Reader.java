package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1.*;

public interface Reader {
    void returnBook (Book title, Administrator name);
    void receiveBook (Book title, Administrator name);
    String getName ();
}
