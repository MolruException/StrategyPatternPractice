package com.molruexception.strategy.duck.quackbehaviors;

import com.molruexception.strategy.duck.quackbehaviors.QuackBehavior;

public class FakeQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quak.");
    }

}
