package com.jluzh.evan.design.pattern.structural.decorator;

public class Test {
    public static void main(String[] args) {
        ABatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);
        System.out.println(aBatterCake.getDesc()+" 总共消费: " + aBatterCake.cost());
    }
}
