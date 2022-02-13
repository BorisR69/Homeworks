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
    public void pay(int amount) {
            setAmount(getAmount() - amount);
            System.out.println("Осуществлен платеж на сумму " + amount + " руб. Остаток на счете: " + getAmount());
    }

    @Override
    public void transfer(Account account, int amount) {
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
