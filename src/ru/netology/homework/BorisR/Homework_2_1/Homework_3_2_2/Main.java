package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2.TaxType.*;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{new Bill(12000.0, new TaxType(), taxService),
                new Bill(20005, new IncomeTaxType(), taxService),
                new Bill(100000.0, new VATaxType(), taxService),
                new Bill(80000, new ProgressiveTaxType(), taxService),
                new Bill(150000, new ProgressiveTaxType(), taxService)
                };
        for (int i = 0; i < payments.length; i++){
            Bill bill = payments[i];
            System.out.println("Получен доход в размере " + bill.getAmount() + " руб.");
            bill.printTaxType();
            bill.payTaxes();
        }
    }
}
