package com.company;


public class Main {



    public static void main(String[] args) {
        Farmer Jorgen = new Farmer( "Jörgen");
        Farmer Joe = new Farmer("Joe");
        Jorgen.barn.addCow(new Cow ("Daisy"));
        Joe.barn.addCow(new Cow("Johan"));
        Joe.barn.addCow(new Cow("Sunshine"));
        Joe.barn.addCow(new Cow("Bettan"));

        System.out.println(Jorgen.milkPot);
        Jorgen.milkSpecifikCow("Daisy");
        System.out.println(Jorgen.milkPot);
        

    }
}
