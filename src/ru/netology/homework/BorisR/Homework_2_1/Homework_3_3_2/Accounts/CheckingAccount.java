package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

import java.awt.image.PackedColorModel;

public class CheckingAccount extends Account {

    public final String NAME = "РАСЧЕТНЫЙ";

    public CheckingAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    @Override
    public void pay(int amount) {
        if (getAmount() >= amount) {
            setAmount(getAmount() - amount);
            System.out.printf("Осуществлен платеж на сумму %s руб. Остаток на счете: %s руб.\n", amount, getAmount());
        } else {
            System.out.printf("Платеж на сумму %s руб. не может быть проведен. Недостаточно средств на счете!\n",
                    amount);
        }
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getAmount() >= amount) {
            setAmount(getAmount() - amount);
            account.setAmount(account.getAmount() + amount);
            System.out.printf("Осуществлен перевод на счет %s на сумму %s руб. Остаток на счете: %s руб. \n",
                    account.getName(), amount, getAmount());
        } else {
            System.out.printf("Перевод на сумму %s руб. не может быть проведен. Недостаточно средств на счете!\n",
                    amount);
        }
    }

    @Override
    public void addMoney(int amount) {
        setAmount(getAmount() + amount);
        System.out.printf("Пополнение счета на %s руб. Остаток на счете: %s руб.\n", amount, getAmount());
    }
}
