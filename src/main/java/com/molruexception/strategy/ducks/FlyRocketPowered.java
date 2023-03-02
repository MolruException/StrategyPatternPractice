package com.molruexception.strategy.ducks;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly rocket powered.");
    }

}
