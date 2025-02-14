package com.zoo.classes.utilities;

import com.zoo.classes.animals.Animal;
import com.zoo.classes.animals.types.Herbo;
import com.zoo.classes.things.Thing;
import java.util.ArrayList;

public class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Thing> things = new ArrayList<>();
    VetClinic Clinic;

    public Zoo() {
        Clinic = new VetClinic();
    }

    public Zoo(VetClinic C) {
        Clinic = C;
    }

    public Zoo(VetClinic C, ArrayList<Animal> A, ArrayList<Thing> T) {
        Clinic = C;
        animals = A;
        things = T;
    }


    public boolean add_animal(Animal animal) {
        if (Clinic.check_animal(animal)) {
            animals.add(animal);
            return true; 
        } else {
            return false;
        }
    }

    public boolean addThing(Thing thing) {
        things.add(thing);
        //System.out.println("Thing added succesfully");
        return true;
    }

    public int get_food_requirements() {
        int requirement = 0;
        for (int i = 0; i < animals.size(); i++) {
            requirement += animals.get(i).get_food();
        }
        return requirement;
    }
    
    public StringBuilder get_animals_list() {
        StringBuilder description = new StringBuilder();
        for (int i = 0; i < animals.size(); i++) {
            description.append(animals.get(i).get_description());
            description.append("\n");
        }
        return description;
    }

    public StringBuilder get_things_list() {
        StringBuilder description = new StringBuilder();
        for (int i = 0; i < things.size(); i++) {
            description.append(things.get(i).get_description());
            description.append("\n");
        }
        return description;
    }

    public StringBuilder get_petable_list() {
        StringBuilder description = new StringBuilder();
        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i) instanceof Herbo) {
                if (((Herbo) animals.get(i)).get_kindness() > 5) {
                    description.append(animals.get(i).get_description());
                }
            }
            description.append("\n");
        }
        return description;
    }

}
