package ru.netology.homework.BorisR.Homework_2_1;

public class homework_2_2_2_1 {

    public static final int SIZE = 5;
    public static final char CROSS = 'X';
    public static final char ZERO = 'O';

    public static void main(String[] args) {

        char [][] field = new char[SIZE][SIZE];

        char [][] field1 = {{'X','X','X','X','X'}, // Матрица 1 (побеждают Х - по горизонтали)
                            {'O','O','O','O','-'},
                            {'-','-','-','-','-'},
                            {'-','-','-','-','-'},
                            {'-','-','-','-','-'}};

        char [][] field2 = {{'O','X','X','X','X'}, // Матрица 2 (побеждают О по вертикали)
                            {'O','O','O','O','-'},
                            {'O','-','-','X','X'},
                            {'O','-','-','-','X'},
                            {'O','-','-','-','X'}};

        char [][] field3 = {{'O','X','X','X','O'}, // Матрица 3 (побеждают О по диагонали)
                            {'O','O','O','O','X'},
                            {'O','-','O','-','X'},
                            {'X','O','-','-','X'},
                            {'O','-','X','X','X'}};

        char [][] field4 = {{'O','X','X','X','X'}, // Матрица 4 (побеждают О по диагонали)
                            {'O','O','O','O','X'},
                            {'-','-','O','X','X'},
                            {'-','-','-','O','X'},
                            {'-','-','-','-','O'}};

        char [][] field5 = {{'O','X','X','X','X'}, // Матрица 5 (никто не побеждает)
                            {'O','O','O','O','X'},
                            {'-','-','O','X','X'},
                            {'-','-','O','-','X'},
                            {'-','-','-','-','O'}};

        System.out.println("Демонстрация работы метода isWin");

        for (int i =1; i <= 5; i++) {
            System.out.println("Вариант " + i);
            switch (i) {
                case 1:
                    field = field1;
                    break;
                case 2:
                    field = field2;
                    break;
                case 3:
                    field = field3;
                    break;
                case 4:
                    field = field4;
                    break;
                case 5:
                    field = field5;
                    break;
            }
            printField(field);
            if (isWin(field, CROSS)) {
                    System.out.println("Победили крестики!");
            } else if (isWin(field, ZERO)) {
                    System.out.println("Победили нолики!");
            } else System.out.println("Никто не победил!");

        }

        System.out.println("Демонстрация закончена!");
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
            if (field [i][i] == player) countWin++;
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
                System.out.print(" | " + cell);
            }
            System.out.println(" |");
        }
    }
}