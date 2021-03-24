package com.codecool.farm.animal;

public class Cattle extends Animal {

    private final int INCREMENT_BY_ONE_MEAL = 2;

    @Override
    public void feed() {
        super.size += INCREMENT_BY_ONE_MEAL;
    }
}
