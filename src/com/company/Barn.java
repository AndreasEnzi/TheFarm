package com.company;

import java.util.ArrayList;

public class Barn {

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addCow(Cow animal){
        animals.add(animal);

    }

    public Animal getAnimal(String animalName){

        for(Animal myArray : animals) {

            if(myArray.getName().equals(animalName))
            return myArray;
        }
        return null;
    }


}
