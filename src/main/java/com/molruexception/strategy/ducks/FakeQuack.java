package com.molruexception.strategy.ducks;

public class FakeQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quak.");
    }

}
