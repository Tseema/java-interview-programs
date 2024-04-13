package com.example.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IceCreamMachine {
    public String[] ingredients; //vanilla
    public String[] toppings; // chocolate

    private LinkedList<Integer> train;

    public static class IceCream {
        public String ingredient; // chocolate sauce
        public String topping;

        public IceCream(String ingredient, String topping) {
            this.ingredient = ingredient; // chocolate sauce
            this.topping = topping;
        }
    }

    public IceCreamMachine(String[] ingredients, String[] toppings) {
        this.ingredients = ingredients; //vanilla
        this.toppings = toppings; // chocolate
    }

    public List<IceCream> scoops() {
        List<IceCream> scoops = new ArrayList<>();

        for(String ingredient: ingredients){
                for(String topping:toppings){
                    scoops.add(new IceCream(ingredient,topping));
                }
        }

        throw new UnsupportedOperationException("Waiting to be implemented");
    }

    public static void main(String[] args) {
        IceCreamMachine machine = new IceCreamMachine(new String[]{
                "vanilla", "chocolate"
        }, new String[]{
                "chocolate sauce"
        });
        List<IceCream> scoops = machine.scoops();

        /*
         * Should print:
         * vanilla, chocolate sauce
         * chocolate, chocolate sauce
         */
        for (IceCream iceCream : scoops) {
            System.out.println(iceCream.ingredient + ", " + iceCream.topping);
        }
    }
}
