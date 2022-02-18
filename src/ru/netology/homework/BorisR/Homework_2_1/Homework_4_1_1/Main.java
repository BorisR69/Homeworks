package ru.netology.homework.BorisR.Homework_2_1.Homework_4_1_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String[] Args) throws NumberFormatException, IndexOutOfBoundsException {
        List<String> tasks = new ArrayList<>();
        boolean choice = true;
        while (choice){
            menu();
            try {
                Scanner scan = new Scanner(System.in);
                int input = Integer.parseInt(scan.nextLine());
                switch (input) {
                    case 0: //Выход из программы
                        choice = false;
                        break;
                    case 1: //Добавление задачи в список
                        System.out.print("Введите задачу для планирования:\n>>");
                        addTask(tasks);
                        break;
                    case 2: //Вывод списка задач
                        printTasks(tasks);
                        break;
                    case 3: //Удаление задачи из списка
                        System.out.print("Введите номер задач для удаления:\n>>");
                        delTask(tasks);
                        break;
                    default: //Обработка события если введен недопустимый номер (не от 0 до 3)
                        System.out.println("Введен некорректный номер, попробуйте снова.");
                        break;
                }
            } catch (NumberFormatException exception) { // Обработка исключения если введено не числовое значение
                System.out.println("Введены некорректные данные, попробуйте снова.");
            }
        }
    }

    public static void menu(){ //Вывод меню
        System.out.print("Выберите действие:\n 1. Добавить задачу\n 2. Вывести список задач\n 3. Удалить задачу\n " +
                "0. Выход\n >>");
    }

    public static void addTask (List<String> tasks){ //Добавление задачи в список
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        tasks.add(task);
    }

    public static void printTasks (List<String> tasks) { //Вывод списка задач
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + 1 + ". " + tasks.get(i));
            }
        }
    }

    public static void delTask(List<String> tasks) throws NumberFormatException, IndexOutOfBoundsException{ //Удаление задачи из списка
        try {
            Scanner scan = new Scanner(System.in);
            int task = Integer.parseInt(scan.nextLine());
            tasks.remove(task - 1);
        } catch (NumberFormatException exception) { // Обработка исключения если введено не числовое значение
            System.out.println("Введены некорректные данные, попробуйте снова.");
        } catch (IndexOutOfBoundsException exception){ // Обработка исключения если номер за пределами списка
            System.out.println("Задача с таким номером не существует, попробуйте снова.");
        }
    }
}
