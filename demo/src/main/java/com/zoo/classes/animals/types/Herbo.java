package com.zoo.classes.animals.types;

import com.zoo.classes.animals.Animal;

public abstract class Herbo extends Animal {
    int Kindness;

    public int get_kindness() {
        return Kindness;
    }

    public void set_kindness(int Kindness) {
        this.Kindness = Kindness;
    }
}
