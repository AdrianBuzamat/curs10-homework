package ro.fasttrackit.curs10.ex1;

import java.util.*;

public class Basket {
    private List<String> fruits;

    public Basket(List<String> fruits) {
        this.fruits = new ArrayList<>();
        this.fruits.addAll(fruits);
    }

    public boolean find(String fruit) {
        for (String iFruit : fruits) {
            if (iFruit.equals(fruit)) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(String fruit) {
        boolean removed = false;
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            if (fruit.equals(iterator.next())) {
                iterator.remove();
                removed = true;
            }

        }
        return removed;
    }

    public int position(String fruit) {
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                return i;
            }
        }
        return -1;
    }

    public Collection<String> distinct() {
        Set<String> distinctFruits = new HashSet<>();
        for (String iFruit : fruits) {
            distinctFruits.add(iFruit);
        }
        return distinctFruits;
    }

    public void add(String fruit) {
        fruits.add(fruit);
    }

    public int count() {
        int count = 0;
        for (int i = 0; i < fruits.size(); i++) {
            count++;
        }
        return count;
    }

    public int customCount() {
        Iterator<String> iterator = fruits.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            iterator.next();
        }
        return count;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "fruits=" + fruits +
                '}';
    }
}
