package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1;

import ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_1.PhoneContacts.Contact;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] Args) throws IndexOutOfBoundsException{

        try {
            List<Contact> contactList = new ArrayList<>();
            contactList.add(0, new Contact("Ivan", "89286784345"));
            contactList.add(1, new Contact("Mikle", "89184435578"));
            contactList.add(2, new Contact("Kate", "89524456788"));
            contactList.add(3, new Contact("Roman", "89523458778"));
            contactList.add(4, new Contact("Olga", "89285672354"));
            System.out.println(contactList);
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Error!");
        }




    }
}
