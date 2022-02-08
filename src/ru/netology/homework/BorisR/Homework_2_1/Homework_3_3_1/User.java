package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1.Interfaces.*;

public class User implements Administrator, Reader, Supplier, Librarian {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void returnBook(Book title, Administrator name) { // Возврат книги читателем
        System.out.println("Читатель " + this.name + " вернул книгу " + title.getTitle() + " администратору " +
                name.getName());

    }

    @Override
    public void receiveBook(Book title, Administrator name) { // Получение книги читателем
        System.out.println("Читатель " + this.name + " получил книгу " + title.getTitle() + " от администратора " +
                name.getName());

    }

    @Override
    public void shipmentBook(Book title, Librarian name) {  // Доставка книги поставщиком
        System.out.println("Поставщик " + this.name + " принес книгу " + title.getTitle() + " библиотекарю " +
                name.getName());

    }

    @Override
    public void orderBook(Book title, Supplier name) {  // Заказ книги библиотекарем
        System.out.println("Библиотекарь " + this.name + " заказала книгу " + title.getTitle() + " у поставщика " +
                name.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public void issuanceBook(Book title, Reader reader) {  // Выдача книги администраторм
        System.out.println("Администратор " + this.name + " выдал книгу " + title.getTitle() + " читателю "
                + reader.getName());
    }

    @Override
    public void overdueNotification(Book title, Reader reader) { // Напоминание о возврате книги
        System.out.println("Администратор " + this.name + " напомнил читателю " + reader.getName() +
                " о необходимости возрата книги " + title.getTitle());
    }
}

