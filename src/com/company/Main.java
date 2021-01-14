package com.company;

public class Main {

    public static void main(String[] args) {
        Hero magic = new Magic();

        Medic medic = new Medic();

        Warrior warrior = new Warrior();

        Hero[] array1 = {magic,medic,warrior};
        String[] array2 = {"Magic used superpower MAGIC DAMAGE","Medic used superpower HEALING","Warrior used superpower CRITICAL DAMAGE"};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array2[i]);
        }

    }
}
