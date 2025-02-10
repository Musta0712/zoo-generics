package org.ies.zoo.model;

import java.util.Arrays;
import java.util.Objects;

public class Enclosure <T extends Animal>{

    private int enclosureNumber;
    private T[] animals;

    public Enclosure(int enclosureNumber, T[] animals) {
        this.enclosureNumber = enclosureNumber;
        this.animals = animals;
    }

    public int getEnclosureNumber() {
        return enclosureNumber;
    }

    public void setEnclosureNumber(int enclosureNumber) {
        this.enclosureNumber = enclosureNumber;
    }

    public T[] getAnimals() {
        return animals;
    }

    public void setAnimals(T[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enclosure<?> enclosure = (Enclosure<?>) o;
        return enclosureNumber == enclosure.enclosureNumber && Objects.deepEquals(animals, enclosure.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enclosureNumber, Arrays.hashCode(animals));
    }

    @Override
    public String toString() {
        return "Enclosure{" +
                "enclosureNumber=" + enclosureNumber +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
