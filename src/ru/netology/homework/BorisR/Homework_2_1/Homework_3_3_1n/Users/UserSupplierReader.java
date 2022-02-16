package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.*;

public class UserSupplierReader extends User implements Supplier, Reader {

    public UserSupplierReader(String name) {
        super(name);
    }

    @Override
    public void shipmentBook(Book title, Librarian name) { // Доставка книги поставщиком
        System.out.println("Поставщик " + this.getName()+ " принес книгу " + title.getTitle() + " библиотекарю " +
                name.getName());
    }

    @Override
    public void returnBook(Book title, Administrator name) { // Возврат книги читателем
        System.out.println("Читатель " + this.getName() + " вернул книгу " + title.getTitle() + " администратору " +
                name.getName());
    }

    @Override
    public void receiveBook(Book title, Administrator name) { // Получение книги читателем
        System.out.println("Читатель " + this.getName() + " получил книгу " + title.getTitle() + " от администратора " +
                name.getName());
    }
}
