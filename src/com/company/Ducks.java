package com.company;



public class Ducks extends DuckComportment{
    int duckNumber;
    String duckType;
    Ducks(int number, String duckType ){
        super();
        this.duckNumber = duckNumber + number;
        this.duckType = duckType;
    }
};

