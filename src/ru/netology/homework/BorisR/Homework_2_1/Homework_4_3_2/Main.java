package ru.netology.homework.BorisR.Homework_2_1.Homework_4_3_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static Set<Student> studentList = new HashSet<>();

    public static void main (String[] Args){
        printMenu();
        System.out.println(studentList.size());
    }

    public static void printMenu(){
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

    public static void createStudentList(String input){
        String[] student = input.split(",\\s");
        Student studentNew = new Student(student[1], student[2], student[0]);
        studentList.add(studentNew);
    }

//    public static void printStudenList (Student studentList){
//        for (Set<Student> s: studentList) {
//        }
//    }
}
