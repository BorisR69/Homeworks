package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Book;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.*;

public class UserAdministrator extends User implements Administrator{

    public UserAdministrator(String name) {
        super(name);
    }

    @Override
    public void issuanceBook(Book title, Reader reader) { // Выдача книги администраторм
        System.out.println("Администратор " + this.getName() + " выдал книгу " + title.getTitle() + " читателю "
                + reader.getName());
    }

    @Override
    public void overdueNotification(Book title, Reader reader) { // Напоминание о возврате книги
        System.out.println("Администратор " + this.getName() + " напомнил читателю " + reader.getName() +
                " о необходимости возрата книги " + title.getTitle());
    }
}
