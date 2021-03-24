package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher {

    private final int CUTTING_SIZE = 5;

    boolean canButcher(Animal animal) {
        return animal.getSize() >= CUTTING_SIZE;
    }

}
