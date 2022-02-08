package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2_2.TaxType;

public class VATaxType extends TaxType { // НДС = 18%
    @Override
    public double calculateTaxFor (double amount) {
        return amount * 0.18;
    }

    @Override
    public void printTaxType () {
        System.out.println("НДС = 18%:");
    }
}
