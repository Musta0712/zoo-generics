package org.ies.zoo.components.Random;

import org.ies.zoo.components.Reader;
import org.ies.zoo.model.Animal;
import org.ies.zoo.model.Enclosure;

import java.util.Random;

public class RandomEnclosureReader<T extends Animal> implements Reader<Enclosure<T>> {

    private final Random random;
    private final Reader<T> animalReader;

    public RandomEnclosureReader(Random random, Reader<T> animalReader) {
        this.random = random;
        this.animalReader = animalReader;
    }

    @Override
    public Enclosure<T> read() {
        int number = random.nextInt(1000);
        T[] animals = (T[]) new Animal[random.nextInt(1,50)];

        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalReader.read();
        }

        return new Enclosure<>(
                number,
                animals
        );
    }
}
