package com.jluzh.evan.design.pattern.creational.factorymethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        Video video = pythonVideoFactory.getVideo();
        video.produce();
        VideoFactory javaVideoFactory = new JavaVideoFactory();
        Video javaVideo = javaVideoFactory.getVideo();
        javaVideo.produce();
    }

}
