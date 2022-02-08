package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.*;

public class userSupplierReader extends User implements Supplier, Reader {

    public userSupplierReader(String name) {
        super(name);
    }

    @Override
    public void shipmentBook(Book title, userLibrarian name) { // Доставка книги поставщиком
        System.out.println("Поставщик " + this.getName()+ " принес книгу " + title.getTitle() + " библиотекарю " +
                name.getName());
    }

    @Override
    public void returnBook(Book title, userAdministrator name) { // Возврат книги читателем
        System.out.println("Читатель " + this.getName() + " вернул книгу " + title.getTitle() + " администратору " +
                name.getName());
    }

    @Override
    public void receiveBook(Book title, userAdministrator name) { // Получение книги читателем
        System.out.println("Читатель " + this.getName() + " получил книгу " + title.getTitle() + " от администратора " +
                name.getName());
    }


}
