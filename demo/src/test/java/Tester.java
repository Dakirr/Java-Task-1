import java.time.chrono.ThaiBuddhistChronology;

import com.zoo.classes.animals.realisations.*;
import com.zoo.classes.things.realisations.*;
import com.zoo.classes.utilities.*;

public class Tester {
    public static void main(String[] args) {
        // Animals
        Monkey M = new Monkey();
        M.set_name("Monk");
        Wolf W = new Wolf("Monk");
        assert(M.get_name() == "Monk");
        assert(M.get_name() == W.get_name());

        M.set_kindness(7);
        Rabbit R = new Rabbit();
        assert(M.get_kindness() == 7);
        assert(R.get_kindness() == M.get_kindness());
        
        R.set_food(1);
        M.set_food(2);
        W.set_food(3);

        VetClinic VC = new VetClinic();
        assert(VC.check_animal(M));

        Zoo Z = new Zoo(VC);
        Z.add_animal(M);
        Z.add_animal(R);
        Z.add_animal(W);
        Computer C = new Computer();
        
        M.set_kindness(0);
        assert(Z.get_food_requirements() == 6);
        assert(Z.get_petable_list().toString() == R.get_description() + "\n");
        Z.addThing(C);
        assert(Z.get_things_list().toString() == C.get_description() + "\n");
        System.out.println("Tests passed");

    }
}
