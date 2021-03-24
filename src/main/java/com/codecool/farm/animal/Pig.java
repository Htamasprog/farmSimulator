package com.codecool.farm.animal;

public class Pig extends Animal {

        private final int INCREMENT_BY_ONE_MEAL = 1;

        @Override
        public void feed() {
            super.size += INCREMENT_BY_ONE_MEAL;
        }
}
