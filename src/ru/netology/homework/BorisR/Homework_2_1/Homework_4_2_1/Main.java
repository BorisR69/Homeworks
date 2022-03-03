package ru.netology.homework.BorisR.Homework_2_1.Homework_4_2_1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main (String[] Args) {
        Queue <Integer> elevator = new LinkedList<>();
        printMenu(elevator);
        printTrace(elevator);
    }

    public static void printMenu (Queue <Integer> elevator) throws NumberFormatException { // Вывод меню
        Scanner scan = new Scanner(System.in);
        boolean start = false;
        int doubleFlour = 0; // Переменная для проверки вовторного ввода этажа
        while (!start) {
            System.out.print("Ожидаю ввода этажа: (для завершения введите 0)\n>>");
            try {
                int input = Integer.parseInt(scan.nextLine());
                if (input == 0) { // При вводе 0 выход из программы
                    elevator.offer(input);
                    start = true;
                    break;
                }
                if (input < 0 || input > 25) { // Проверка, что номер этажа входит в диапазон допустимых
                    System.out.println("Такого этажа нет в доме.");
                } else {
                    if (elevator.isEmpty()) { // Если это первый ввведенный этаж добавляем в очередь
                        elevator.offer(input);
                        doubleFlour = input;
                    } else {
                        if (doubleFlour == input) { // Если уже есть введенные этажи проверяем, что номер
                            // не повторяется 2 раза подряд
                            System.out.println("Этаж введен повторно.");
                        } else {
                            elevator.offer(input);
                            doubleFlour = input;
                        }
                    }
                }
            } catch (NumberFormatException exception) {
            }
        }
    }

    public static void printTrace (Queue <Integer> elevator){ // Вывод последовательности этажей и времени на маршрут
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;

        while (!elevator.isEmpty()){
            System.out.print((elevator.peek() != 0) ? "этаж - " + elevator.peek() + " -> " : "этаж - " + elevator.peek());
            if (previousFloor != -1) {
                int currentFloor = elevator.peek();
                totalSeconds += Math.abs(currentFloor - previousFloor ) * waitMoveInSeconds + waitDoorsInSeconds;
            }
            previousFloor = elevator.poll();
            }
        System.out.println("\nВремя движения лифта по маршруту составило " + totalSeconds + " секунд.");
    }
}
