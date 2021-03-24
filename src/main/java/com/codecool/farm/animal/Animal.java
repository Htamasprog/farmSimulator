package com.codecool.farm.animal;

public abstract class Animal {

    int size = 0;

    public abstract void feed();

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " sized " + getClass().getSimpleName().toLowerCase();
    }
}
