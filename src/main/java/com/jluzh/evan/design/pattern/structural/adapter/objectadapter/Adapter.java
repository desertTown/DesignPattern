package com.jluzh.evan.design.pattern.structural.adapter.objectadapter;

public class Adapter implements Target{
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adpapteeRequest();
    }
}
