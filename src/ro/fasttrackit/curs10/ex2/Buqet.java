package ro.fasttrackit.curs10.ex2;

import java.util.*;

public class Buqet {
    private Set<String> flowers;

    public Buqet(Set<String> flowers) {
        this.flowers = new HashSet<>();
        this.flowers.addAll(flowers);
    }

    public Collection<String> getAll() {
        Collection<String> buquetFlower = new HashSet<>();
        for (String flower : flowers) {
            buquetFlower.add(flower);
        }
        return buquetFlower;
    }

    public void add(String flower) {
        Iterator<String> iterator = flowers.iterator();
        if (!flower.equals(flowers.iterator())) {
            flowers.add(flower);
        } else {
            System.out.println(flower + " already exists!");
        }
    }

    public void remove(String flower) {
        Iterator<String> iterator = flowers.iterator();
        if (!flower.equals(flowers.iterator())) {
            flowers.remove(flower);
        } else {
            System.out.println(flower + " not found!");
        }
    }
}
