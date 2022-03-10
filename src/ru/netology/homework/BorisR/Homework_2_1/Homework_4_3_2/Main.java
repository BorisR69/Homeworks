package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Student> studentList = new HashSet<>();

    public static void main (String[] Args){
        printMenu(); // Вызов меню ввода студентов
        printStudentList(studentList); // Вызов вывода списка студентов
    }

    public static void printMenu(){ // Меню ввода студентов
        Scanner inp = new Scanner(System.in);
        while (true) {
            System.out.print("\nВведите информацию о студенте (для завершения работы программы введите \"end\")\n>>");
            String input  = inp.nextLine().trim();
            if (input.equals("end")){
                break;
            } else {
            createStudentList(input);
            }
        }
    }

    public static void createStudentList(String input){ // Создание записи в списке студентов
        String[] student = input.split(",\\s");
        Student studentNew = new Student(student[0], student[1], student[2]);
        if (studentList.contains(studentNew)) {
            System.out.println("Студент с таким Id уже существует, запись не сохранена!");
        } else {
            studentList.add(studentNew);
        }
    }

    public static void printStudentList (Set <Student> studentList){ // Вывод списка студентов
        System.out.println("Список студентов: ");
        for (Student s: studentList) {
            System.out.println(s);
        }
    }
}
