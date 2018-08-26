package com.jluzh.evan.design.principle.dependencyinversion;

public class FECourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Study FECourse");
    }
}
