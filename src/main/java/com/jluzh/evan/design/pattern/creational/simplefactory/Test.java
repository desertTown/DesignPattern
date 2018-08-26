package com.jluzh.evan.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("python");
        if (video == null) {
            return;
        }
        video.produce();
    }

}
