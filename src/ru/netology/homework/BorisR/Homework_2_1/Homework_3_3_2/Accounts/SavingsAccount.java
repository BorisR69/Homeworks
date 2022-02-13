package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public class SavingsAccount extends Account {

    private final String NAME = "СБЕРЕГАТЕЛЬНЫЙ";

    public SavingsAccount(int amount) {
        super(amount);
        setName(NAME);
    }

    public String getNAME (){
        return NAME;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Сберегательный счет не предназначен для платежей!");
    }

    @Override
    public void transfer(Account account, int amount) {
        if (getAmount() >= amount) {
            switch (account.getName()) {
                case "КРЕДИТНЫЙ":
                    if ((account.getAmount() + amount) <= 0) {
                        setAmount(getAmount() - amount);
                        account.setAmount(account.getAmount() + amount);
                        System.out.printf("Осуществлен перевод на счет %s на сумму %s руб. Остаток на счете: %s руб. \n",
                                account.getName(), amount, getAmount());
                    } else {
                        System.out.println("Нельзя перевести на счет КРЕДИТНЫЙ сумму " + amount + " руб., т.к. " +
                                "баланс счета " + "станет " + "положительным!");
                    }
                    break;
                case "СБЕРЕГАТЕЛЬНЫЙ":
                case "РАСЧЕТНЫЙ":
                    setAmount(getAmount() - amount);
                    account.setAmount(account.getAmount() + amount);
                    System.out.printf("Осуществлен перевод на счет %s на сумму %s руб. Остаток на счете: %s руб. \n",
                            account.getName(), amount, getAmount());
                    break;
            }
        } else{
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
