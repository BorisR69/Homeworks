package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;

public interface Supplier {
    void shipmentBook (Book title, Librarian name);
    String getName ();
}
