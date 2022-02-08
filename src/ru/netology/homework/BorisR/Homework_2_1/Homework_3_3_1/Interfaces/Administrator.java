package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1.*;

public interface Administrator {
    void issuanceBook (Book title, Reader reader);
    void overdueNotification(Book title, Reader reader);
    String getName ();
}
