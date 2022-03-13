package ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_1;

import ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_1.PhoneContacts.PhoneBook;
import ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_1.PhoneContacts.MissedCalls;
import java.time.LocalDateTime;
import static ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_1.PhoneContacts.PhoneBook.*;

public class Main {

    public static void main (String[] Args) {

        PhoneBook phoneBook = new PhoneBook();
        MissedCalls missedCalls = new MissedCalls();
        writeGroups(phoneBook); // Наполнение списка групп контактов
        writeContacts(phoneBook); // Наполнение списка контактов
        writeMissedcalls(missedCalls); // Наполнение списка пропущенных вызовов
        missedCalls.printMissedCalls(phoneBook); // Отображение списка пропущенных вызовов

        }

    private static void writeGroups(PhoneBook phoneBook) { // Наполнение списка групп контактов
        phoneBook.addGroup("Family");
        phoneBook.addGroup("Work");
        phoneBook.addGroup("Friends");
        phoneBook.addGroup("Chiefs");
    }

    private static void writeContacts (PhoneBook phoneBook) { // Наполнение списка контактов
        phoneBook.addContactToGroup(createContact("George","12345"),"Family", "Friends");
        phoneBook.addContactToGroup(createContact("Olga", "23456"), "Family");
        phoneBook.addContactToGroup(createContact("Nick", "34567"), "Work", "Friends");
        phoneBook.addContactToGroup(createContact("Julia", "45678"), "Chiefs");
    }

    private static void writeMissedcalls(MissedCalls missedCalls) { // Наполнение списка пропущенных вызовов
        missedCalls.addMissedCalls(LocalDateTime.now(), "12345");
        missedCalls.addMissedCalls(LocalDateTime.now().plusMinutes(1),"15963");
        missedCalls.addMissedCalls(LocalDateTime.now().plusMinutes(2), "34567");
        missedCalls.addMissedCalls(LocalDateTime.now().plusMinutes(3), "78915");
    }
}
