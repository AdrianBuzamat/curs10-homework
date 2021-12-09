package ro.fasttrackit.curs10.ex1;

import java.util.List;

public class MainBasket {
    public static void main(String[] args) {
        Basket basket=new Basket(List.of("mere", "pere","banane"));
        System.out.println(basket.find("banane"));
        System.out.println(basket.find("kiwi"));
        basket.add("mango");
        System.out.println(basket.remove("pere"));
        System.out.println(basket.position("mango"));
        basket.add("mango");
        basket.add("kaki");
        basket.add("kiwi");
        basket.add("banane");
        basket.add("struguri");
        System.out.println(basket.distinct());
        System.out.println(basket.count());
        System.out.println(basket.toString());
        System.out.println(basket.customCount());


    }
}
