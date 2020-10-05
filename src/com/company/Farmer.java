package com.company;

public class Farmer extends Person {
        Barn barn = new Barn();
        int milkPot = 0;
    public Farmer (String name){
        super(name);

    }

    public void milkSpecifikCow(String name){

    Cow cow = (Cow) barn.getAnimal(name);


        milkPot += cow.milkCow();
    }

}
