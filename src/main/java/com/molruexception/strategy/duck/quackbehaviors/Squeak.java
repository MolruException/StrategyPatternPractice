package com.molruexception.strategy.duck.quackbehaviors;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak.");
    }

}
