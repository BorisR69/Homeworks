package ru.netology.homework.BorisR.Homework_2_1.Homework_3_4_1;

import java.util.Scanner;

public class Main {

    static boolean enter = false;

    public static void main (String [] Args) throws UserNotFoundException, AccessDeniedException {
        Scanner scan = new Scanner(System.in);
        String login;
        String password;

        System.out.print("Для доступа к ресурсу введите через пробел логин и пароль: \n>>");
        login = scan.next();
        password = scan.next();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);

        if (enter) {
            System.out.println("Доступ предоставлен!");
        }
    }

    public static User[] getUsers() {
        User user1 = new User("jhon", "pass1", 24, "jhon@gmail.com");
        User user2 = new User("Paul", "pass2", 12, "paul@gmail.com");
        User user3 = new User("Kate", "pass3", 18, "kate@box.ru");
        User user4 = new User("Bob", "pass4", 45, "bob@mi.com");
        return new User[]{user1, user2, user3, user4};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)){
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден!");
    }

    public static void validateUser(User user) throws AccessDeniedException{
        if (user.age >= 18) {
            enter = true;
        } else {
            throw new AccessDeniedException("Возраст недостаточен для доступа к ресурсу!");
        }
    }
}