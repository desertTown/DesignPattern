package com.jluzh.evan.design.principle.dependencyinversion;

public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Study JavaCourse");
    }
}
