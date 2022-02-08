package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD.TaxTypeBD.*;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxServiceBD taxService = new TaxServiceBD();
        BillBD[] payments = new BillBD[]{new BillBD(BigDecimal.valueOf(12000.0), new TaxTypeBD(), taxService),
                new BillBD(BigDecimal.valueOf(80000), new ProgressiveTaxTypeBD(), taxService),
                new BillBD(BigDecimal.valueOf(150000), new ProgressiveTaxTypeBD(), taxService)
        };
        for (int i = 0; i < payments.length; i++){
            BillBD bill = payments[i];
            System.out.println("Получен доход в размере " + bill.getAmount() + " руб.");
            bill.printTaxType();
            bill.payTaxes();
        }
    }
}