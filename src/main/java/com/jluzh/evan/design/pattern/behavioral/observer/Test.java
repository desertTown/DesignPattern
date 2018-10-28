package com.jluzh.evan.design.pattern.behavioral.observer;

/**
 * @author EvanHuang
 * @date 10/28/2018 3:10 PM
 * @since
 */
public class Test {

    public static void main(String[] args) {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("Evan");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course,question);
    }
}
