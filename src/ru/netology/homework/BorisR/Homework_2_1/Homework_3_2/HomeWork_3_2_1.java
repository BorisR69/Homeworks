package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2;

import java.util.Scanner;

public class HomeWork_3_2_1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player();

        while (true) {
            System.out.format("У игрока %d слотов с оружием," +
                              " введите номер, чтобы выстрелить," +
                              " -1 чтобы выйти\n" + ">>", player.getSlotsCount());
            int slot = input.nextInt();
            if (slot == -1) {
                System.out.println("Игра окончена!");
                break;
            } else player.shotWithWeapon(slot);
        }
    }
}
