package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users.*;


public class Main {
    public static void main (String [] Args){

        Book book1 = new Book("Java для чайников");
        userReader reader = new userReader("Петр");                          // Читатель
        userAdministrator administrator = new userAdministrator("Федор");    // Администратор
        userLibrarian librarian = new userLibrarian("Наталья");              // Библиотекарь
        userSupplierReader supplierReader = new userSupplierReader("Иван");  // Поставщик и Читатель

        librarian.orderBook(book1, supplierReader);
        supplierReader.shipmentBook(book1, librarian);
        administrator.issuanceBook(book1, reader);
        administrator.overdueNotification(book1, reader);
        reader.returnBook(book1, administrator);
        supplierReader.receiveBook(book1, administrator);

    }
}
