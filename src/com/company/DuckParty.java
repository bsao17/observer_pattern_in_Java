package com.company;

public class DuckParty {

    public static void main(String[] args) {
        Ducks colvert = new Ducks(2, "Colvert");
        Ducks duckToy = new Ducks(1, "toy");
        Ducks duckPicture = new Ducks(5, "images");

        System.out.println("Ce canard est de la race des " + colvert.duckType + " !");
        System.out.println("et il y en aura " + colvert.duckNumber + " à la canard partie !");
    }
}
