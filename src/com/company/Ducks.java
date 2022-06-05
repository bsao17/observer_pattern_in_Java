package com.company;

import com.company.behaviors.Behaviors;

public class Ducks implements Behaviors {
    int duckNumber;
    String duckType;
    Ducks(int number, String duckType ){
        super();
        this.duckNumber = duckNumber + number;
        this.duckType = duckType;
    }
    @Override
    public void singing(String value) {
        System.out.println(value);
    }
    @Override
    public void flying(String value){
        System.out.println(value);
    }
};

