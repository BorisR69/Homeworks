package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD;

import java.math.BigDecimal;

public class TaxServiceBD {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %s рублей%n", taxAmount);
        System.out.println("");
    }
}
