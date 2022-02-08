package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD.TaxServiceBD;
import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2_BD.TaxTypeBD.*;
import java.math.BigDecimal;

public class BillBD {

        private BigDecimal amount;
        private TaxTypeBD taxType;
        private TaxServiceBD taxService;

        public BillBD(BigDecimal amount, TaxTypeBD taxType, TaxServiceBD taxService) {
            this.amount = amount;
            this.taxType = taxType;
            this.taxService = taxService;
        }

        public void payTaxes() {
            // TODO вместо 0.0 посчитать размер налога исходя из TaxType
            BigDecimal taxAmount = taxType.calculateTaxFor(amount);
            taxService.payOut(taxAmount);
        }

        public void printTaxType () {
            taxType.printTaxType();
        }

        public BigDecimal getAmount () {
            return amount;
        }




}
