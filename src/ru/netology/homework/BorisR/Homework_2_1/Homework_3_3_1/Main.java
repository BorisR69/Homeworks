package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1;

public class Main {
    public static void main (String [] Args){

        Book book1 = new Book("Java для чайников");
        User user1 = new User("Петр");     // Читатель
        User user2 = new User("Федор");    // Администратор
        User user3 = new User("Наталья");  // Библиотекарь
        User user4 = new User("Иван");     // Поставщик и Читатель

        user3.orderBook(book1, user4);
        user4.shipmentBook(book1, user3);
        user2.issuanceBook(book1, user1);
        user2.overdueNotification(book1, user1);
        user1.returnBook(book1, user2);
        user4.receiveBook(book1, user2);

    }
}
