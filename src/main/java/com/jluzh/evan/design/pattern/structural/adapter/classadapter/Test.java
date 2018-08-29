package com.jluzh.evan.design.pattern.structural.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adpterTarget = new Adapter();
        adpterTarget.request();
    }
}
