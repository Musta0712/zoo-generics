package org.ies.zoo.components.Random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Herbivores;

import java.util.Random;

public class RandomHerbivoresReader implements Reader<Herbivores> {

    private final static String[] SPECIES = {
            "Elefante", "Rinoceronte", "Cebra", "Caballo", "Koala"
    };


    private final static String[] NAMES = {
            "Messi", "CR7", "Luchito", "Casillas", "Mbappe"
    };

    private final static String[] PLANTSTYPE = {
            "Romero", "Cúrcuma", "Albahaca", "Hoja", "Trigo"
    };


    private final Random random;

    public RandomHerbivoresReader(Random random) {
        this.random = random;
    }

    public Herbivores read() {
        return new Herbivores(
                SPECIES[random.nextInt(SPECIES.length)],
                random.nextInt(20),
                NAMES[random.nextInt(NAMES.length)],
                PLANTSTYPE[random.nextInt(PLANTSTYPE.length)]
        );
    }
}
