package com.molruexception.strategy.duck.flybehaviors;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly no way.");
    }

}
