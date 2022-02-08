package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public class SavingsAccount extends Account {

    public final String NAME = "СБЕРЕГАТЕЛЬНЫЙ";

    public SavingsAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Сберегательный счет не предназначен для платежей!");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getAmount() >= amount) {
            setAmount(getAmount() - amount);
            account.setAmount(account.getAmount() + amount);
            System.out.println("Осуществлен перевод на счет " + account.getName() + " на сумму " + amount +
                    " руб. Остаток на счете: " + getAmount());
        } else {
            System.out.printf("Перевод на сумму %s руб. не может быть проведен. Недостаточно средств на счете!\n",
                    amount);
        }

    }

    @Override
    public void addMoney(int amount) {
            setAmount(getAmount() + amount);
            System.out.println("Пополнение счета на " + amount + " руб. Остаток на счете: " + getAmount());
        }
}
