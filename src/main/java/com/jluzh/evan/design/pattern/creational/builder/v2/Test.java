package com.jluzh.evan.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder().buildCPU("酷睿I7").buildMainBoard("华硕主板").build();
        System.out.println(computer);
    }
}
