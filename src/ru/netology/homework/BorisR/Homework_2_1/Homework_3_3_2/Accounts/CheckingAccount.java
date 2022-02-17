package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public class CheckingAccount extends Account {

    private final String NAME = "РАСЧЕТНЫЙ";

    public CheckingAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    public String getNAME (){
        return NAME;
    }

    @Override
    public boolean pay(int amount) {
        if (getAmount() >= amount) {
            setAmount(getAmount() - amount);
            System.out.printf("Осуществлен платеж на сумму %s руб. Остаток на счете: %s руб.\n", amount, getAmount());
            return true;
        } else {
            System.out.printf("Платеж на сумму %s руб. не может быть проведен. Недостаточно средств на счете!\n",
                    amount);
            return false;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (getAmount() < amount) {
            System.out.printf("Перевод на сумму %s руб. не может быть проведен. Недостаточно средств на счете!\n",
                    amount);
            return false;
        }
        final boolean result = account.addMoney(amount);
        if (result) {
            setAmount(getAmount() - amount);
            System.out.printf("Осуществлен перевод на счет %s на сумму %s руб. Остаток на счете: %s руб. \n",
                        account.getName(), amount, getAmount());
        }   return result;
        }

    @Override
    public boolean addMoney(int amount) {
        setAmount(getAmount() + amount);
        System.out.printf("Поступление на счет %s на %s руб. Остаток на счете %s: %s руб.\n", getNAME(), amount,
                getNAME(), getAmount());
        return true;
    }
}
