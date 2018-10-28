package com.jluzh.evan.design.pattern.behavioral.command;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:21 PM
 * @since
 */
public class Test {

    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲 -- By Evan");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommond(openCourseVideoCommand);
        staff.addCommond(closeCourseVideoCommand);

        staff.executeCommands();


    }
}
