package com.jluzh.evan.design.principle.dependencyinversion;

public class Test {
    // v1 面向过程的方式
//    public static void main(String[] args) {
//        Evan evan = new Evan();
//        evan.studyFECourse();
//        evan.studyJavaCourse();
//    }
    // v2 方法参数
//    public static void main(String[] args) {
//        Evan evan = new Evan();
//        evan.study(new JavaCourse());
//        evan.study(new FECourse());
//    }
    // v3 构造方法传参的方式
//    public static void main(String[] args) {
//        Evan evan1 = new Evan(new JavaCourse());
//        evan1.study();
//        Evan evan2 = new Evan(new FECourse());
//        evan2.study();
//    }
    // v4 设置对象参数的形式
    public static void main(String[] args) {
        Evan evan = new Evan();
        evan.setCourse(new JavaCourse());
        evan.study();
        evan.setCourse(new FECourse());
        evan.study();
    }
}
