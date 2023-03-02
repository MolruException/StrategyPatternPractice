package com.molruexception.strategy.ducks;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly no way.");
    }

}
