package com.jluzh.evan.design.pattern.structural.adapter.objectadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adpterTarget = new Adapter();
        adpterTarget.request();
    }
}
