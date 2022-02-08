package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users.userAdministrator;

public interface Reader {
    void returnBook (Book title, userAdministrator name);
    void receiveBook (Book title, userAdministrator name);
    String getName ();
}
