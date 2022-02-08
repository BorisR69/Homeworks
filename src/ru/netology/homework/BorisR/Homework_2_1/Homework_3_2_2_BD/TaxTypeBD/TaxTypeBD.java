package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD.TaxTypeBD;

import java.math.BigDecimal;

public class TaxTypeBD { // Налог 0%

    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return BigDecimal.valueOf(0.0);
    }

    public void printTaxType () {
        System.out.println("Доход не облагается налогом:");
    }
}
