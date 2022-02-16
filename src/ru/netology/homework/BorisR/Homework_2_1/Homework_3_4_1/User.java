package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_1;

public class User {
    String login;
    String password;
    int age;
    String email;

    public User (String login, String password, int age, String email) {
        this.login = login;
        this.password = password;
        this.age = age;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}
