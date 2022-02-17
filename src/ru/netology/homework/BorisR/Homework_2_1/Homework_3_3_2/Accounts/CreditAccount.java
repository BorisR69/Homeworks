package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public class CreditAccount extends Account {

    private final String NAME = "КРЕДИТНЫЙ";

    public CreditAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    public String getNAME (){
        return NAME;
    }

    @Override
    public boolean pay(int amount) {
            setAmount(getAmount() - amount);
            System.out.println("Осуществлен платеж на сумму " + amount + " руб. Остаток на счете: " + getAmount());
            return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        final boolean result = account.addMoney(amount);
        if (result) {
            setAmount(getAmount() - amount);
            System.out.printf("Осуществлен перевод на счет %s на сумму %s руб. Остаток на счете: %s руб. \n",
                    account.getName(), amount, getAmount());
        }   return result;
    }

    @Override
    public boolean addMoney(int amount) {
        if (getAmount() + amount > 0) {
            System.out.println("Нельзя пополнить счет КРЕДИТНЫЙ на сумму " + amount + " руб., т.к. " +
                    "баланс счета станет " + "положительным!");
            return false;
        } else {
            setAmount(getAmount() + amount);
            System.out.printf("Поступление на счет %s на %s руб. Остаток на счете %s: %s руб.\n", getNAME(), amount,
                    getNAME(), getAmount());
            return true;
        }
    }
}
