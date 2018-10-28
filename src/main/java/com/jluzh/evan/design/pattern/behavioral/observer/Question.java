package com.jluzh.evan.design.pattern.behavioral.observer;

/**
 * @author EvanHuang
 * @date 10/28/2018 3:07 PM
 * @since
 */
public class Question {
    private String userName;

    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
