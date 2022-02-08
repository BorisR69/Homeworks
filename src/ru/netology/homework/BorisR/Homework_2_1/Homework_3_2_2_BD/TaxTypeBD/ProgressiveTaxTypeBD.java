package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD.TaxTypeBD;

import java.math.BigDecimal;

    public class ProgressiveTaxTypeBD extends TaxTypeBD {

        @Override
        public BigDecimal calculateTaxFor(BigDecimal amount) {
            int checkSumm = amount.compareTo(BigDecimal.valueOf(100000.0));
            return amount.multiply (BigDecimal.valueOf(checkSumm < 0 ? 0.1 : 0.15));
        }

        @Override
        public void printTaxType() {
            System.out.println("Прогрессивный налог до 100 тысяч = 10%, больше 100 тысяч = 15%:");
        }
    }


