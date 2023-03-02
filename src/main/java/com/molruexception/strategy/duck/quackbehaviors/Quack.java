package com.molruexception.strategy.duck.quackbehaviors;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
