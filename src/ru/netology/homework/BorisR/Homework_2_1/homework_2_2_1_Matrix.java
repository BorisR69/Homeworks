package ru.netology.homework.BorisR.Homework_2_1;

import java.util.Random;

public class homework_2_2_1_Matrix {

    public static int matrixSize = 8; // Размер матрицы
    public static int[][] matrix = new int[matrixSize][matrixSize]; // Массив для оригинальной матрицы
    public static int[][] rotatedMatrix = new int[matrixSize][matrixSize]; // Массив для модифицированной матрицы

    static void printMatrix(int matrix[][]) { //Вывод матрицы на консоль
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("*********************************");
    }

    static void makeMatrix() { // Заполнение оригинальной матрицы
        Random random = new Random();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }

    static void rotatedMatrix(int[][] matrix, int angle) { // Поворот матрицы
        switch (angle) {
            case 90: // Поворот на 90 градусов
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        rotatedMatrix[j][i] = matrix[matrixSize - (i + 1)][j];
                    }
                }
                break;
            case 180:  // Поворот на 180 градусов
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        rotatedMatrix[i][j] = matrix[matrixSize - (i + 1)][matrixSize - (j + 1)];
                    }
                }
                break;
            case 270:  // Поворот на 270 градусов
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        rotatedMatrix[j][i] = matrix[i][matrixSize - (j + 1)];
                    }
                }
                break;
            default:
                System.out.println("Введен некорректный угол поворота.");
        }
    }
}