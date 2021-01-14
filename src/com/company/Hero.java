package com.company;

public abstract class Hero {
    int Health;
    int Damage;
    String typeSuperPower;

    HavingSuperAbility havingSuperAbility = new HavingSuperAbility() {
        @Override
        public void ApplySuperAbility(String superAbilityType) {
        }
    };
}
