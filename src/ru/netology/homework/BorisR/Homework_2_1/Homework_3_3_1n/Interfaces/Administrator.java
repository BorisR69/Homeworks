package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users.userReader;

public interface Administrator {
    void issuanceBook (Book title, userReader reader);
    void overdueNotification(Book title, userReader reader);
    String getName ();
}
