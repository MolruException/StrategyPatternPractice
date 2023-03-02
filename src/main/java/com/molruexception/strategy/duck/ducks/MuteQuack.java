package com.molruexception.strategy.duck.ducks;

import com.molruexception.strategy.duck.quackbehaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Mute quack.");
    }

}
