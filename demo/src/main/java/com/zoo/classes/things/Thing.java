package com.zoo.classes.things;

import com.zoo.interfaces.IInventory;

public abstract class Thing implements IInventory{
    int Number = (int)(System.currentTimeMillis());
    protected String Name;

    public int get_number() {
        return Number;
    }

    public void set_number(int Number) {
        this.Number = Number;
    }

    public StringBuilder get_description() {
        StringBuilder description = new StringBuilder("" + Number);
        description.append(". ");
        description.append(Name);
        return description;
    }

    public void set_name (String Name) {
        this.Name = Name;
    }

    public String get_name() {
        return Name;
    }
}
