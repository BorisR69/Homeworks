package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts.*;

public class Main {
    public static void main(String[] Args) {

    Account checkingAccount = new CheckingAccount(500);
    Account savingAccount = new SavingsAccount(200);
    Account creditAccount = new CreditAccount(0);

    System.out.printf("\n**** Операции со счетом %s ****\nОстаток на счете: %s руб.\n", checkingAccount.getName(),
            checkingAccount.getAmount());
    checkingAccount.addMoney(200);
    checkingAccount.pay(500);
    checkingAccount.pay(1000);
    checkingAccount.transfer(savingAccount, 100);
    checkingAccount.transfer(savingAccount, 1000);

    System.out.printf("\n**** Операции со счетом %s ****\nОстаток на счете: %s руб.\n", savingAccount.getName(),
            savingAccount.getAmount());
    savingAccount.addMoney(300);
    savingAccount.pay(500);
    savingAccount.pay(1000);
    savingAccount.transfer(checkingAccount, 50);
    savingAccount.transfer(checkingAccount, 1000);

    System.out.printf("\n**** Операции со счетом %s ****\nОстаток на счете: %s руб.\n", creditAccount.getName(),
            creditAccount.getAmount());
    creditAccount.addMoney(300);
    creditAccount.pay(500);
    creditAccount.pay(1000);
    creditAccount.transfer(checkingAccount, 50);
    creditAccount.transfer(checkingAccount, 1000);
    creditAccount.addMoney(1000);

    System.out.printf("\nИтоговые остатки по счетам:\n%s - %s руб.\n%s - %s руб.\n%s - %s руб.",
            checkingAccount.getName(), checkingAccount.getAmount(), savingAccount.getName(),
            savingAccount.getAmount(), creditAccount.getName(), creditAccount.getAmount());

}


}
