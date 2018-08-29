package com.jluzh.evan.design.pattern.structural.adapter.classadapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        this.adpapteeRequest();
    }
}
