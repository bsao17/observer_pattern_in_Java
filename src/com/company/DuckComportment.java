package com.company;

public class DuckComportment implements Behavioral {
    @Override
    public void singing(String value) {
        System.out.println(value);
    }
    @Override
    public void flying(boolean value){
        if(value){
            System.out.println("this duck can fly ...");
        }else {
            System.out.println("This duck can't fly ...");
        }

    }
}
