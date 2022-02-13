package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Users.*;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_1n.Interfaces.*;


public class Main {
    public static void main (String [] Args){

        Book book1 = new Book("Java для чайников");
        Reader reader = new UserReader("Петр");                          // Читатель
        Administrator administrator = new UserAdministrator("Федор");    // Администратор
        Librarian librarian = new UserLibrarian("Наталья");              // Библиотекарь
        UserSupplierReader supplierReader = new UserSupplierReader("Иван");  // Поставщик_Читатель
        Supplier supplierR = supplierReader; // Поставщик_Читатель как Поставщик
        Reader readerS = supplierReader; // Поставщик_Читатель как Читатель

        librarian.orderBook(book1, supplierReader);
        supplierR.shipmentBook(book1, librarian);
        administrator.issuanceBook(book1, reader);
        administrator.overdueNotification(book1, reader);
        reader.returnBook(book1, administrator);
        readerS.receiveBook(book1, administrator);

    }
}
