package com.jluzh.evan.design.pattern.structural.decorator;

public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    public void doSomething() {

    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
