package com.company;

public class Main {

    public static void main(String[] args) {
        Ducks colvert = new Ducks(2, "Colvert");
        Ducks duckToy = new Ducks(1, "toy");
        Ducks duckPicture = new Ducks(5, "hologram");

        System.out.println("The specie of this duck is " + colvert.duckType + " !");
        System.out.println("and there will " + colvert.duckNumber + " duck at the party !");

        colvert.singing("the Duck sing ... Coin Coin Coin");
        colvert.flying(true);

        duckToy.singing("This duck singing ... pwet pwet pwet");
        duckToy.flying(false);
    }
}
