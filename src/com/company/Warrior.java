package com.company;

public class Warrior extends Hero implements HavingSuperAbility{

    @Override
    public void ApplySuperAbility(String superAbilityType) {
        System.out.println("Warrior used superpower CRITICAL DAMAGE");
    }
}
