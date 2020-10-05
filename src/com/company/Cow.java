package com.company;

public class Cow extends Animal {

    int milkAmount =10;
    int milkTotal=30;

public Cow(String name){
    super(name);
}

    public int milkCow(){

    milkTotal = milkTotal - milkAmount;

    return milkAmount;
}
}