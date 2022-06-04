package com.company;

public class Ducks {
    int duckNumber;
    String duckType;
    Ducks(int number, String duckType ){
        this.duckNumber = duckNumber + number;
        this.duckType = duckType;
    }
    Ducks colvert = new Ducks(2, "Colvert");
    Ducks duckToy = new Ducks(1, "toy");
    Ducks duckPicture = new Ducks(5, "images");
};

