package com.company;

public class Magic extends Hero implements HavingSuperAbility{

    @Override
    public void ApplySuperAbility(String superAbilityType) {
        System.out.println("Magic used superpower MAGIC DAMAGE");
    }
}
