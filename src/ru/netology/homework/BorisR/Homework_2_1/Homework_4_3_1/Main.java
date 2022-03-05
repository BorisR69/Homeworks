package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1;

import ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts.*;

import static ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts.PhoneBook.*;

public class Main {

    public static void main (String[] Args) {

        String testNumber = "23456";
        String testGroup = "Family";

        PhoneBook phoneBook = new PhoneBook();
        writeGroups(phoneBook); // Наполнение списка групп контактов
        writeContacts(phoneBook); // Наполнение списка контактов

        // Вывод контакта по номеру телефона
        System.out.println("Contact by phone number: " + phoneBook.findContactByPhone(testNumber));
        // Вывод списка всех контактов из группы
        System.out.println("All contacts in group " + testGroup + " :");
        for (Contact contact: phoneBook.findContactsByGroup(testGroup)) {
            System.out.println(contact);
        }

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
}
