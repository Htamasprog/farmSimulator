package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.List;
import java.util.stream.Collectors;

class Farm {

    private final List<Animal> ANIMALS;

    public Farm(List<Animal> animals) {
        this.ANIMALS = animals;
    }

    List<String> getStatus() {
        return ANIMALS.stream()
                .map(animal -> "There is a " + animal.toString() + " in the farm.")
                .collect(Collectors.toList());
    }

    List<Animal> getAnimals() {
        return ANIMALS;
    }

    void feedAnimals() {
        ANIMALS.forEach(Animal::feed);
    }

    void butcher(Butcher butcher) {
        ANIMALS.removeIf(butcher::canButcher);
    }

    boolean isEmpty() {
        return ANIMALS.size() == 0;
    }
}
