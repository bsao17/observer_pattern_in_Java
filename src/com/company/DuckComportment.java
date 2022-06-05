package com.company;

public class DuckComportment implements Behavioral {
    @Override
    public void singing(String value) {
        System.out.println(value);
    }
    @Override
    public void flying(String value){
        System.out.println(value);
    }
}
