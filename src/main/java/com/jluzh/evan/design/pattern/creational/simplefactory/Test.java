package com.jluzh.evan.design.pattern.creational.simplefactory;

public class Test {
//    public static void main(String[] args) {
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("python");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }
    // 使用反射解决开闭原则问题
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }

}
