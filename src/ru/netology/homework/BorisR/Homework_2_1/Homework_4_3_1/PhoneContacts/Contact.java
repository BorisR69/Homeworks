package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String name;
    private String number;

//    List<Contact> contactList = new ArrayList<>();

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString(){
        return "Contact: " + name + " - phone number: " + number;
    }
}
