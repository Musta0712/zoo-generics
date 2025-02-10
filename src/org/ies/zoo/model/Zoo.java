package org.ies.zoo.model;

import java.util.Arrays;
import java.util.Objects;

public class Zoo {

    private String zooName;
    private Enclosure<Herbivores> herbivoreEnclosure;
    private Enclosure<Carnivores> carnivoreEnclosure;
    private Enclosure<Animal> animalEnclosure;

    public Zoo(String zooName, Enclosure<Herbivores> herbivoreEnclosure, Enclosure<Carnivores> carnivoreEnclosure, Enclosure<Animal> animalEnclosure) {
        this.zooName = zooName;
        this.herbivoreEnclosure = herbivoreEnclosure;
        this.carnivoreEnclosure = carnivoreEnclosure;
        this.animalEnclosure = animalEnclosure;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public Enclosure<Herbivores> getHerbivoreEnclosure() {
        return herbivoreEnclosure;
    }

    public void setHerbivoreEnclosure(Enclosure<Herbivores> herbivoreEnclosure) {
        this.herbivoreEnclosure = herbivoreEnclosure;
    }

    public Enclosure<Animal> getAnimalEnclosure() {
        return animalEnclosure;
    }

    public void setAnimalEnclosure(Enclosure<Animal> animalEnclosure) {
        this.animalEnclosure = animalEnclosure;
    }

    public Enclosure<Carnivores> getCarnivoreEnclosure() {
        return carnivoreEnclosure;
    }

    public void setCarnivoreEnclosure(Enclosure<Carnivores> carnivoreEnclosure) {
        this.carnivoreEnclosure = carnivoreEnclosure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zoo zoo = (Zoo) o;
        return Objects.equals(zooName, zoo.zooName) && Objects.equals(herbivoreEnclosure, zoo.herbivoreEnclosure) && Objects.equals(carnivoreEnclosure, zoo.carnivoreEnclosure) && Objects.equals(animalEnclosure, zoo.animalEnclosure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zooName, herbivoreEnclosure, carnivoreEnclosure, animalEnclosure);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "zooName='" + zooName + '\'' +
                ", herbivoreEnclosure=" + herbivoreEnclosure +
                ", carnivoreEnclosure=" + carnivoreEnclosure +
                ", animalEnclosure=" + animalEnclosure +
                '}';
    }

    public void showInfo(){
        System.out.println(zooName);

        System.out.println("Area de herbivoros " + herbivoreEnclosure.getEnclosureNumber());
        System.out.println(Arrays.toString(herbivoreEnclosure.getAnimals()));
        herbivoreEnclosure.
    }
}
