package ru.netology.homework.BorisR.Homework_2_1.Homework_3_3_2.Accounts;

public abstract class Account {

    private int amount;
    private String name;

    protected Account(int amount) {this.amount = amount;}

    public void setAmount (int amount) {this.amount = amount;}

    public int getAmount () {return amount;}

    public void setName (String name) {this.name = name;}

    public String getName () {return name;}

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);


}
