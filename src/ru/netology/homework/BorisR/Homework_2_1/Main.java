package ru.netology.homework.BorisR.Homework_2_1;

import java.util.Scanner;

public class Main {

    static int[] busket = new int[7];
    static String[] products = {"Хлеб", "Молоко", "Сахар", "Сыр", "Картофель", "Морковь", "Яблоки"};
    static int[] prices = {34, 75, 49, 740, 48, 44, 68};
    static int sumProducts = 0;

    public static void main(String[] args) {
        Scanner choice = new Scanner(System.in);
        System.out.println("Список возможных товаров для покупки:"); // Вывод списка товаров
        for (int i = 0; i < prices.length; i++) {
            System.out.println(i + 1 + ". " + products[i] + " - " + prices[i] + " руб.");
        }
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`:");
            System.out.println("В вашей корзине покупок на сумму " + sumProducts + " руб.");
            String input = choice.next();
            if ("end".equals(input)) {
                busketFinal(); // Вывод финальной корзины
                System.out.println("Удачных покупок в будущем. \nДо свидания.");
                break; // Выход из программы
            }
            busketIn (Integer.parseInt(input), Integer.parseInt(choice.next())); // Наполнение корзины
        }
    }

    public static void busketIn(int productNumber, int productCount) { //Наполнение корзины
        busket[productNumber - 1] = busket[productNumber - 1] + productCount;
        sumProducts = sumProducts + productCount * prices[productNumber-1];
    }

    public static void busketFinal() { // Финальная корзина
        System.out.println("Ваша корзина:\n" + "Наименование товара   Количество  Цена/за.ед  Общая стоимость");
        for (int j = 0; j < products.length; j++){
            if (busket[j] != 0) {
                System.out.printf("%-21s %-11s %-11s %-15s \n", products[j], busket[j], prices[j], prices[j]*busket[j]);
            }
        }
        System.out.println("Всего покупок на сумму: " + sumProducts + " руб.");
    }
}


