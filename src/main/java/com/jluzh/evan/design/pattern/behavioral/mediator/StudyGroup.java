package com.jluzh.evan.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:36 PM
 * @since
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
