package org.ies.zoo.components.Random;


import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Carnivores;

import java.util.Random;

public class RandomCarnivoresReader implements Reader<Carnivores> {

    private final static String[] SPECIES = {
            "Caimán", "Leopardo", "Puma", "Buitre", "Hiena"
    };

    private final static String[] NAMES = {
            "Lola", "LaTere", "Hermelegildo", "Pepa", "ElBicho"
    };

    private final static String[] MEATTYPE = {
            "Salchichita", "Humanos", "CarneEnDescomposición", "Pescado", "ChuletitaDeCerdito"
    };

    private final Random random;

    public RandomCarnivoresReader(Random random) {
        this.random = random;
    }

    @Override
    public Carnivores read() {
        return new Carnivores(
                SPECIES[random.nextInt(SPECIES.length)],
                random.nextInt(20),
                NAMES[random.nextInt(NAMES.length)],
                MEATTYPE[random.nextInt(MEATTYPE.length)]
        );
    }
}
