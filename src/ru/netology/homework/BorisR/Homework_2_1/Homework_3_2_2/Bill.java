package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2.TaxType.TaxType;

public class Bill {
    private double amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill (double amount, TaxType taxType, TaxService taxService) {
        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        // TODO вместо 0.0 посчитать размер налога исходя из TaxType
        double taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }

    public void printTaxType () {
        taxType.printTaxType();
    }

    public double getAmount () {
        return amount;
    }
}
