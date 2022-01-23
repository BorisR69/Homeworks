package ru.netology.homework.BorisR.Homework_2_1;

import java.util.Scanner;


public class homework_2_2_2 {

    public static final int SIZE = 5;
    public static final char EMPTY = '-';
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY;
            }
        }

        Scanner scanner = new Scanner(System.in);

        boolean isCrossTurn = true;

        while (true) {
            printField(field);
            System.out.print("Ходят " + (isCrossTurn ? "крестики" : "нолики") + "!" + "\n>>");
            String input = scanner.nextLine(); // "2 3"
            String[] parts = input.split(" "); // ["2" , "3"]
            int r = Integer.parseInt(parts[0]) - 1; // 2-1 = 1
            int c = Integer.parseInt(parts[1]) - 1; // 3-1 = 2

            if (field[r][c] != EMPTY) {
                System.out.println("Сюда ходить нельзя");
                continue;
            }

            field[r][c] = isCrossTurn ? CROSS : ZERO;

            if (isWin(field, isCrossTurn ? CROSS : ZERO)) {
//                printField(field);
                System.out.println("Победили " + (isCrossTurn ? "крестики" : "нолики"));
                break;
            } else {
                if (isCrossTurn) {
                    isCrossTurn = false;
                } else {
                    isCrossTurn = true;
                }
            }
        }

        System.out.println("Игра закончена!");
    }


    public static boolean isWin(char[][] field, char player) {
        int countWin;

        for (int i = 0; i < SIZE; i++) { // Проверка строк
            countWin = 0;
            for (int j = 0; j < SIZE; j++){
                if (field [i][j] == player) {
                countWin++;
                }
                if (countWin == SIZE) {
                    return true;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) { // Проверка столбцов
            countWin = 0;
            for (int j = 0; j < SIZE; j++){
                if (field [j][i] == player) {
                    countWin++;
                }
                if (countWin == SIZE) {
                    return true;
                }
            }
        }
        countWin = 0; // Обнуление счетчика побед перед проверкой первой диагонали

        for (int i =0; i < SIZE; i++) { // Проверка первой диагонали
            int j = i;
            if (field [i][j] == player) countWin++;
            if (countWin == SIZE) return true;
        }
        countWin = 0; // Обнуление счетчика побед перед проверкой второй диагонали

        for (int i =0; i < SIZE; i++) { // Проверка второй диагонали
            int j = SIZE - 1 - i;
            if (field [i][j] == player) countWin++;
            if (countWin == SIZE) return true;
        }

        return false;
    }

    public static void printField(char[][] field) {
        for (char[] row : field) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}


