package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;

public interface Administrator {
    void issuanceBook (Book title, Reader reader);
    void overdueNotification(Book title, Reader reader);
    String getName ();
}
