package com.company;

public class Main {

    public static void main(String[] args) {
Boss boss = new Boss(700, 50);
boss.weapon.setName(" AK-47 ");
boss.weapon.setType("Автомат ");
        System.out.println(boss.info());
        System.out.println("");
    }

}
