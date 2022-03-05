package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1;

import ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts.*;

import static ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts.PhoneBook.*;

public class Main {

    public static void main (String[] Args) {

        PhoneBook phoneBook = new PhoneBook();
        writeGroups(phoneBook);
        writeContacts(phoneBook);

        System.out.println("Contact by phone number: " + phoneBook.findContactByPhone("23456"));

    }

    private static void writeGroups(PhoneBook phoneBook) {
        phoneBook.addGroup("Family");
        phoneBook.addGroup("Work");
        phoneBook.addGroup("Friends");
        phoneBook.addGroup("Chiefs");
    }

    private static void writeContacts (PhoneBook phoneBook) {
        phoneBook.addContactToGroup(createContact("George","12345"),"Family", "Friends");
        phoneBook.addContactToGroup(createContact("Olga", "23456"), "Family");
        phoneBook.addContactToGroup(createContact("Nick", "34567"), "Work", "Friends");
        phoneBook.addContactToGroup(createContact("Julia", "45678"), "Chiefs");
    }
}
