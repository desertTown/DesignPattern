package com.jluzh.evan.design.pattern.creational.singleton;

public class HungrySingleton {
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
