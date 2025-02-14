package com.zoo.classes.utilities;
import com.zoo.classes.animals.realisations.Monkey;
import com.zoo.classes.animals.realisations.Rabbit;
import com.zoo.classes.animals.realisations.Tiger;
import com.zoo.classes.animals.realisations.Wolf;
import com.zoo.classes.things.realisations.Computer;


public class Console {
    Zoo zoo;
    boolean state = true;
    
    public Console () {
        this.zoo = new Zoo();
    }

    public Console(Zoo zoo) {
        this.zoo = zoo;
    }

    public boolean is_active() {
        return state;
    }


    void R_add(String S) {
        switch (S) {
            case "monkey":
                if (zoo.add_animal(new Monkey())) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("ERROR: animal rejected due to the medical reasons");
                }
                break;
            case "rabbit":                
                if (zoo.add_animal(new Rabbit())) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("ERROR: animal rejected due to the medical reasons");
                }
                break;
            case "tiger":                
                if (zoo.add_animal(new Tiger())) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("ERROR: animal rejected due to the medical reasons");
                }
                break;
            case "wolf":                
                if (zoo.add_animal(new Wolf())) {
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("ERROR: animal rejected due to the medical reasons");
                }
                break;
            case "computer":
                zoo.addThing(new Computer());
                System.out.println("SUCCESS");
                break;
            case "table":
                zoo.addThing(new com.zoo.classes.things.realisations.Table());
                System.out.println("SUCCESS");
                break;
            default:
                System.out.println("ERROR: There is no such animal or thing");
        }
    }

    void R_get_food() {
        System.out.println("SUCCESS");
        System.out.println(zoo.get_food_requirements());
    }

    void R_get_animals_list() {
        System.out.println("SUCCESS");
        System.out.println(zoo.get_animals_list());
    }

    void R_get_things_list() {
        System.out.println("SUCCESS");
        System.out.println(zoo.get_things_list());
    }

    void R_get_petable_list() {
        System.out.println("SUCCESS");
        System.out.println(zoo.get_petable_list());
    }

    void R_get_full_list() {
        System.out.println("SUCCESS");
        StringBuilder a = zoo.get_animals_list();
        a.append(zoo.get_things_list());
        System.out.println(a);
    }

    public void parce(String S) {
        String[] commands = S.toLowerCase().split(" ");
        switch (commands[0]) {
            case "add":
                R_add(commands[1]);
                break;
            case "get":
                switch (commands[1]) {
                    case "food":
                        R_get_food();
                        break;
                    case "pets":
                        R_get_petable_list();
                        break;
                    case "animals":
                        R_get_animals_list();
                        break;
                    case "things":
                        R_get_things_list();
                        break;
                    case "all":
                        R_get_full_list();
                        break;
                    default:
                        StringBuilder a = new StringBuilder("ERROR: wrong argument for get command: ");
                        a.append(commands[1]);
                        System.out.println(a);
                        break;
                }
                break;
            
            case "exit":
                state = false;
                break;

            default:
                StringBuilder a = new StringBuilder("ERROR: unknown command: ");
                a.append(commands[0]);
                System.out.println(a);
                break;
        }
    }
}

