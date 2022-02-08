package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.Reader;

public class userReader extends User implements Reader {

    public userReader(String name) {
        super(name);
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
