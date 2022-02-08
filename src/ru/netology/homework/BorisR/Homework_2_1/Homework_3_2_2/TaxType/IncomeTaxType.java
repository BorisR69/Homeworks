package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2.TaxType;

public class IncomeTaxType extends TaxType { // Подоходный налог = 13%
    @Override
    public double calculateTaxFor(double amount) {
        return amount * 0.13;
    }

    @Override
    public void printTaxType () {
        System.out.println("Подоходный налог = 13%:");
    }
}
