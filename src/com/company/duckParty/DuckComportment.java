package com.company.duckParty;

public class DuckComportment implements Behavioral {
    public int duckNumber;
    public String duckType;
    @Override
    public void singing(boolean value) {
        if (value) {
            System.out.println("the Duck sing ... Coin Coin Coin");
        } else {
            System.out.println("Sorry, this duck type cannot singing !");
        }
    }

    @Override
    public void flying(boolean value) {
        if (value) {
            System.out.println("this duck can fly ...");
        } else {
            System.out.println("Sorry, this duck type cannot fly !");
        }
    }
}
