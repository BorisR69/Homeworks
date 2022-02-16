package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.*;

public class UserLibrarian extends User implements Librarian {

    public UserLibrarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Book title, Supplier name) { // Заказ книги библиотекарем
        System.out.println("Библиотекарь " + this.getName() + " заказала книгу " + title.getTitle() + " у поставщика " +
                name.getName());
    }
}
