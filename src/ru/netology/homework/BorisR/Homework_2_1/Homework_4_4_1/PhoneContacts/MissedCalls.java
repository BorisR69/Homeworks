package ru.netology.homework.BorisR.Homework_2_1.Homework_4_4_1.PhoneContacts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Map;
import java.util.TreeMap;

public class MissedCalls {
    private LocalDateTime time;
    private String number;
    final DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
    private Map<LocalDateTime, String> missedCallsList = new TreeMap<>();

    public void addMissedCalls (LocalDateTime time, String number) {
        missedCallsList.put(time, number);
    }

    @Override
    public String toString() {
        return "Пропущенные вызовы:" + missedCallsList;
    }

    public void printMissedCalls(PhoneBook phoneBook) {
        System.out.println("***********************************");
        System.out.println("*    Список пропущеных вызовов    *");
        System.out.println("***********************************");
        for (Map.Entry<LocalDateTime, String> missedCall: missedCallsList.entrySet()) {
            final Contact contact = phoneBook.findContactByPhone(missedCall.getValue());
            if (contact != null){
                System.out.println(formatter.format(missedCall.getKey()) + "\t-\t" + contact.getName());
            } else {
                System.out.println(formatter.format(missedCall.getKey()) + "\t-\t" + missedCall.getValue());
            }
        }
    }
}
