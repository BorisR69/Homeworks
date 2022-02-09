package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public class CreditAccount extends Account {

    private final String NAME = "КРЕДИТНЫЙ";

    public CreditAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    @Override
    public void pay(int amount) {
            setAmount(getAmount() - amount);
            System.out.println("Осуществлен платеж на сумму " + amount + " руб. Остаток на счете: " + getAmount());
    }

    @Override
    public void transfer(Account account, int amount) {
            setAmount(getAmount() - amount);
            account.setAmount(account.getAmount() + amount);
            System.out.println("Осуществлен перевод на счет " + account.getName() + " на сумму " + amount +
                    " руб. Остаток на счете: " + getAmount());
    }

    @Override
    public void addMoney(int amount) {
        if (getAmount() + amount <= 0) {
            setAmount(getAmount() + amount);
            System.out.println("Пополнение счета на " + amount + " руб. Остаток на счете: " + getAmount());
        } else {
            System.out.println("Нельзя пополнить счет на сумму " + amount + " руб., т.к. баланс счета станет " +
                    "положительным!");
        }
    }
}
