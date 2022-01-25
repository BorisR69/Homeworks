package ru.netology.homework.BorisR.Homework_2_1;

import java.util.Scanner;
import java.util.Random;

public class homework_2_2_1 {

    public static void main(String[] args) {

        int matrixSize = 8; // Размер матрицы
        int[][] matrix = new int[matrixSize][matrixSize]; // Мааисв для первоначальной матрицы
        int[][] rotatedMatrix = new int [matrixSize][matrixSize]; // Массив для модифицированной матрицы
        int angle;

        makeMatrix(matrix, matrixSize); // Создание оригинальной матрицы
        System.out.println("***** Оригинальная  матрица *****");
        printMatrix(matrix); // Вывод оригинальной матрицы на консоль

        Scanner scan = new Scanner(System.in); // Запрос угла поворота матрицы
        System.out.print("\nВведите угол поворота матрицы в градусах (90, 180 или 270):\n" + ">>" );
        angle = scan.nextInt();

        if (angle == 90 || angle == 180 || angle == 270) {
            rotatedMatrix (matrix, angle, rotatedMatrix, matrixSize); // Поворот матрицы на заданный угол
            System.out.println("**** Поворот на " + angle + " градусов ****");
            printMatrix(rotatedMatrix);  // Вывод модифицированной матрицы на консоль
        } else System.out.println("Введен некорректный угол поворота.");
    }

    static void printMatrix(int[][] matrix) { //Вывод матрицы на консоль
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println("");
        }
        System.out.println("********************");
    }
    static void makeMatrix(int[][] matrix, int matrixSize){ // Заполнение матрицы
        Random random = new Random();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
    }
    static void rotatedMatrix (int [][]matrix, int angle, int [][] rotatedMatrix, int matrixSize) { // Поворот матрицы
        switch (angle) {
            case 90:
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        rotatedMatrix[j][i] = matrix[matrixSize - (i + 1)][j]; // Поворот на 90 градусов
                    }
                }
                break;
            case 180:
            for (int i = 0; i < matrixSize; i++) {
                for (int j = 0; j < matrixSize; j++) {
                    rotatedMatrix[i][j] = matrix[matrixSize - (i + 1)][matrixSize - (j + 1)]; // Поворот на 180 градусов
                }
            }
            break;
            case 270:
                for (int i = 0; i < matrixSize; i++) {
                    for (int j = 0; j < matrixSize; j++) {
                        rotatedMatrix[j][i] = matrix[i][matrixSize - (j + 1)]; // Поворот на 270 градусов
                    }
                }
                break;
            }
        }
    }

