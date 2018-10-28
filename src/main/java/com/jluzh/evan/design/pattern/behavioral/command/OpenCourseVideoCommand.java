package com.jluzh.evan.design.pattern.behavioral.command;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:18 PM
 * @since
 */
public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
