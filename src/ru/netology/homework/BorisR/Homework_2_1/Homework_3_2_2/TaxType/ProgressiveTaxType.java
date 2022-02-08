package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2.TaxType;

public class ProgressiveTaxType extends TaxType {

    @Override
    public double calculateTaxFor(double amount) {
        if (amount <= 100000.0) {
            return amount * 0.1;
        } else {
            return amount * 0.15;
        }
    }

    @Override
    public void printTaxType () {
        System.out.println("Прогрессивный налог до 100 тысяч = 10%, больше 100 тысяч = 15%:");
    }
}
