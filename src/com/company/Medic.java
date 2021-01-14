package com.company;

public class Medic extends Hero implements HavingSuperAbility{

    @Override
    public void ApplySuperAbility(String superAbilityType) {
        System.out.println("Medic used superpower HEALING");
    }
}
