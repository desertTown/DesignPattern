package com.jluzh.evan.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @author EvanHuang
 * @date 10/28/2018 3:06 PM
 * @since
 */
public class Course extends Observable{

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName()+"在"+course.courseName+"提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
