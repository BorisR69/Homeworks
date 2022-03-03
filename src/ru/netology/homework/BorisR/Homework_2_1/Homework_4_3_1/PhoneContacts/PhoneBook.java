package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts;

import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private String groupName;
    private List <Contact> contactList;

    public HashMap <String, List<Contact>> groups = new HashMap<>();

    public void addContact(String groupName, List<Contact> contactList){
        groups.put(groupName, contactList);
    }



}

