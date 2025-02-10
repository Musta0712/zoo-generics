package org.ies.zoo;


import org.ies.zoo.components.Random.*;
import org.ies.zoo.components.Reader;
import org.ies.zoo.model.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Reader<Carnivores> carnivoresReader = new RandomCarnivoresReader(random);
        Reader<Herbivores> herbivoresReader = new RandomHerbivoresReader(random);
        Reader<Animal> animalReader = new RandomAnimalReader(herbivoresReader, carnivoresReader, random);

        Reader<Enclosure<Herbivores>> herbivoreEnclosureReader = new RandomEnclosureReader<>(
                random,
                herbivoresReader
        );

        Reader<Enclosure<Carnivores>> carnivoresEnclosureReader = new RandomEnclosureReader<>(
                random,
                carnivoresReader
        );

        Reader<Enclosure<Animal>> animalEnclosureReader = new RandomEnclosureReader<>(
                random,
                animalReader
        );

        Reader<Zoo> zooReader = new ZooRandomReader(
                random,
                herbivoreEnclosureReader,
                carnivoresEnclosureReader,
                animalEnclosureReader
        );

        Zoo zoo = zooReader.read();
        zoo.showInfo();
    }
}