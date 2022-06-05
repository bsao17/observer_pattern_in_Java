package com.company;

import com.company.behaviors.Soundable;

public class Ducks implements Soundable {
    int duckNumber;
    String duckType;
    Ducks(int number, String duckType ){
        super();
        this.duckNumber = duckNumber + number;
        this.duckType = duckType;
    }

    @Override
    public void singing() {
        System.out.println("the Duck sing ... Coin Coin Coin");
    }
};

