package org.ies.zoo.components.Random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.*;

import java.util.Random;

public class ZooRandomReader implements Reader<Zoo> {

    private final static String[] NAMES = {
            "Zoo de Madrid", "Zoo de Barcelona", "Zoo de Valencia", "Zoo de Sevilla", "Zoo de Bilbao"
    };

    private final Random random;
    private final Reader<Enclosure<Herbivores>> herbivoreEnclosureReader;
    private final Reader<Enclosure<Carnivores>> carnivoresEnclosureReader;
    private final Reader<Enclosure<Animal>> animalEnclosureReader;

    public ZooRandomReader(Random random, Reader<Enclosure<Herbivores>> herbivoreEnclosureReader, Reader<Enclosure<Carnivores>> carnivoresEnclosureReader, Reader<Enclosure<Animal>> animalEnclosureReader) {
        this.random = random;
        this.herbivoreEnclosureReader = herbivoreEnclosureReader;
        this.carnivoresEnclosureReader = carnivoresEnclosureReader;
        this.animalEnclosureReader = animalEnclosureReader;
    }

    @Override
    public Zoo read() {
        return new Zoo(
                NAMES[random.nextInt(NAMES.length)],
                herbivoreEnclosureReader.read(),
                carnivoresEnclosureReader.read(),
                animalEnclosureReader.read()
        );
    }
}
