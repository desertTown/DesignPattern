package com.jluzh.evan.design.pattern.behavioral.command;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:17 PM
 * @since
 */
public class CloseCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
