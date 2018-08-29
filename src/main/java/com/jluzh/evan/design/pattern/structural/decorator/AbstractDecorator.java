package com.jluzh.evan.design.pattern.structural.decorator;

public abstract class AbstractDecorator implements ABatterCake {

    ABatterCake aBatterCake;

    public AbstractDecorator(ABatterCake aBatterCake) {
        this.aBatterCake = aBatterCake;
    }

    public String getDesc() {
        return aBatterCake.getDesc();
    }

    public int cost() {
        return aBatterCake.cost();
    }

    public abstract void doSomething();
}
