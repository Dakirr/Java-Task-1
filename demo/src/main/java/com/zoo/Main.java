package com.zoo;

import com.zoo.classes.utilities.Console;
import com.zoo.classes.utilities.Zoo;
import com.zoo.classes.utilities.VetClinic;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        VetClinic V = new VetClinic();
        Zoo Z = new Zoo(V);
        Console C = new Console(Z);
        
        Scanner scanner = new Scanner(System.in);

        while (C.is_active()) {
            C.parce(scanner.nextLine());
        }
        scanner.close();
    }
}
