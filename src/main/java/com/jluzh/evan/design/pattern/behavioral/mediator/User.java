package com.jluzh.evan.design.pattern.behavioral.mediator;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:36 PM
 * @since
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
