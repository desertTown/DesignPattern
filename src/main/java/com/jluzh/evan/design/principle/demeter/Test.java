package com.jluzh.evan.design.principle.demeter;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.commandCheckNum(new TeamLeader());
    }
}
