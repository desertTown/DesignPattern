package com.jluzh.evan.design.principle.dependencyinversion;

public class Evan {
    private ICourse course;

    public void study() {
        course.study();
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }
}
