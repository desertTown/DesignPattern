package com.jluzh.evan.design.principle.demeter;

public class Boss {
    public void commandCheckNum(TeamLeader teamLeader) {
        teamLeader.checkNumberOfCourses();
    }
}
