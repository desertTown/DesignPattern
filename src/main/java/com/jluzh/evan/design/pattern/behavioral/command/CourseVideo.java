package com.jluzh.evan.design.pattern.behavioral.command;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:16 PM
 * @since
 */
public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }
    public void open(){
        System.out.println(this.name+"课程视频开放");
    }
    public void close(){
        System.out.println(this.name+"课程视频关闭");
    }
}
