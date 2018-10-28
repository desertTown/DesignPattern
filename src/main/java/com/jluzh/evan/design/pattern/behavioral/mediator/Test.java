package com.jluzh.evan.design.pattern.behavioral.mediator;

/**
 * @author EvanHuang
 * @date 10/28/2018 4:37 PM
 * @since
 */
public class Test {
    public static void main(String[] args) {
        User evan = new User("Evan");
        User tom= new User("Tom");

        evan.sendMessage(" Hey! Tom! Let's learn Design Pattern");
        tom.sendMessage("OK! Evan");
    }


}
