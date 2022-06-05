package com.company;

import com.company.behaviors.Behaviors;

public class DuckComportment implements Behaviors {
    @Override
    public void singing(String value) {
        System.out.println(value);
    }
    @Override
    public void flying(String value){
        System.out.println(value);
    }
}
