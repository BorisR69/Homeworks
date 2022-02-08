package ru.netology.homework.BorisR.Homework_2_1.Homework_3_2;

import ru.netology.homework.BorisR.Homework_2_1.Homework_3_2.Weapon.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                new Pistol(),
                new AssoultRifle(),
                new Rpg(),
                new Slingshot(),
                new WaterPistol()
        };
    }

    public int getSlotsCount (){
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponSlots.length || slot < -1) {
            System.out.println("Номер оружия введен некорректно, попробуйте снова!");
        } else {
            Weapon weapon = weaponSlots[slot - 1];
            weapon.shot();
        }
    }
}