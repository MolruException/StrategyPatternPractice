package com.molruexception.strategy.ducks;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("quack");
    }

}
