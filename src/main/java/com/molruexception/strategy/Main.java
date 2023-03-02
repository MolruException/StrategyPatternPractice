package com.molruexception.strategy;

import com.google.common.collect.Lists;
import com.molruexception.strategy.duck.ducks.Duck;
import com.molruexception.strategy.duck.ducks.FakeQuack;
import com.molruexception.strategy.duck.ducks.ModelDuck;
import com.molruexception.strategy.duck.flybehaviors.FlyNoWay;
import com.molruexception.strategy.duck.quackbehaviors.RubberDuck;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final Duck rubberDuck = new RubberDuck();
        rubberDuck.setFlyBehavior(new FlyNoWay());
        rubberDuck.setQuackBehavior(new FakeQuack());

        final Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyNoWay());
        modelDuck.setQuackBehavior(new FakeQuack());

        final List<Duck> ducks = Lists.newArrayList(rubberDuck, modelDuck);
        ducks.forEach(duck -> {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        });
    }
}