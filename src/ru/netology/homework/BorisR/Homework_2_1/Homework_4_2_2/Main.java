package ru.netology.homework.BorisR.Homework_2_1.Homework_4_2_2;

import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] Args){
        List<String> formula = new ArrayList<>(); // Коллекция для анализа формулы
        Queue <Integer> numbers = new LinkedList<>(); // Коллеция для чисел
        Deque <String> operators = new ArrayDeque<>(); // Коллекция для математических символов
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите математическую формулу:\n>>");
        String input = scan.nextLine().trim();

        String delimiter = "(\\d+)|([+*-/])"; // Regex - Числа или математические символы
        Matcher matcher = Pattern.compile(delimiter).matcher(input); // matcher для поиска чисел и мат. символов
        while (matcher.find()) {
            formula.add(matcher.group()); // Заполнение коллекции содержащей числа и мат. смволы
        }
        formula.forEach(k -> {
            if (k.matches("\\d+")) {
                numbers.add(Integer.parseInt(k)); // Заполнение коллеции чисел
            } else {operators.addFirst(k);} // Заполнение коллекции мат. символов
        });
        System.out.println(formula);
        while (!numbers.isEmpty()) System.out.print(numbers.poll() +" "); // Вывод коллекции чисел
        while (!operators.isEmpty()) System.out.print(operators.poll()); // Вывод коллекции мат. смволов
        }
}
