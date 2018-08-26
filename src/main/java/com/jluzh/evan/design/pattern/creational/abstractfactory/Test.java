package com.jluzh.evan.design.pattern.creational.abstractfactory;

public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article javaArticle = courseFactory.getArticle();
        Video javaVideo = courseFactory.getVideo();
        javaArticle.produce();
        javaVideo.produce();

    }
}
