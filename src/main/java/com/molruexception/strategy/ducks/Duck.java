package com.molruexception.strategy.ducks;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        if (flyBehavior == null) {
            throw new NullPointerException("FlyBehavior를 반드시 설정하여야 합니다.");
        }

        flyBehavior.fly();
    }

    public void performQuack() {
        if (quackBehavior == null) {
            throw new NullPointerException("QuackBehavior를 반드시 설정하여야 합니다.");
        }

        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("swim.");
    }

    public abstract void display();

}
