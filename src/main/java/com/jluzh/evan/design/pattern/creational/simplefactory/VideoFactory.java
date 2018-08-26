package com.jluzh.evan.design.pattern.creational.simplefactory;

public class VideoFactory {

//   public Video getVideo(String type){
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        } else if ("python".equals(type)) {
//            return new PythonVideo();
//        } else {
//            return null;
//        }
//   }

    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
