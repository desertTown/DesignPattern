package com.jluzh.evan.design.pattern.structural.decorator;

public class BatterCake implements ABatterCake{
    public String getDesc() {
        return "煎饼";
    }

    public int cost() {
        return 8;
    }
}
