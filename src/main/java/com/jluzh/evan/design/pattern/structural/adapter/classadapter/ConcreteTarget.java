package com.jluzh.evan.design.pattern.structural.adapter.classadapter;

public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("concrete的目标方法");
    }
}
