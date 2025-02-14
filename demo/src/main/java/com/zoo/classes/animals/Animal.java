package com.zoo.classes.animals;

import com.zoo.interfaces.IAlive;
import com.zoo.interfaces.IInventory;


public abstract class Animal implements IAlive, IInventory {
    int Food;
    int Number = (int)(System.currentTimeMillis());
    
    protected String Name;

    public int get_food() {
        return Food;
    }

    public void set_food(int Food) {
        this.Food = Food;
    }

    public int get_number() {
        return Number;
    }

    public void set_number(int Number) {
        this.Number = Number;
    }

    public void set_name (String Name) {
        this.Name = Name;
    }

    public String get_name() {
        return Name;
    }


    public StringBuilder get_description() {
        StringBuilder description = new StringBuilder("" + this.Number);
        description.append(". ");
        description.append(Name);
        return description;
    }
}
