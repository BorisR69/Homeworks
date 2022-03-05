package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private String groupName;
    private List <Contact> contactList;

    private HashMap <String, List<Contact>> storage = new HashMap<>();

    public boolean addGroup (String groupName) { // Добавление группы
        if (storage.containsKey(groupName)) // Если такая группа уже есть, ничего не делаем
            return false;
        storage.put(groupName, new ArrayList<>());
        return true;
    }

    public boolean addContactToGroup (Contact contact, String... groupNames) { //Добавление контакта в группы
        for (String groupName: groupNames) {
            if (!storage.containsKey(groupName)) // Если такой группы нет, ничего не делаем
                return false;
            final List<Contact> contacts = storage.get(groupNames);
//            List<Contact> contacts = phoneBook.get(groupNames);
            contacts.add(contact);
        }
        return true;
    }

    public List<Contact> findContactsByGroup (String groupName) {
        return storage.get(groupName);
    }

    public Contact findContactByPhone (String phone) {
        for (List<Contact> group : storage.values()) { // Перебор групп
            for (Contact contact : group) { // Перебор номеров в группе
                if (contact.getNumber().equals(phone))
                    return contact;
            }
        }
        return null;
    }

    public static Contact createContact (String name, String number) {
        return new Contact(name, number);
    }

}

