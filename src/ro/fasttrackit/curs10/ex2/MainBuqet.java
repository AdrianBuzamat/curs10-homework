package ro.fasttrackit.curs10.ex2;

import java.util.Set;

public class MainBuqet {
    public static void main(String[] args) {
        Buqet buqet= new Buqet(Set.of("Crizantema","Lalea", "Feriga"));
        buqet.add("Trandafir");
        System.out.println(buqet.getAll());
        buqet.remove("Feriga");
        System.out.println(buqet.getAll());

    }

}
