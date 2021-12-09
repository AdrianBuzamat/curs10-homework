package ro.fasttrackit.curs10.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private ArrayList<String> fruits;

    public Basket(Collection<String> fruits) {
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
        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(fruit)) {
                fruits.remove(fruits.get(i));
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
        List<String> distinctFruits = new ArrayList<>();
        for (String iFruit : fruits) {
            if (!distinctFruits.contains(iFruit)) {
                distinctFruits.add(iFruit);
            }
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
