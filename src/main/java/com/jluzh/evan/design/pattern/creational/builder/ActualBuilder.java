package com.jluzh.evan.design.pattern.creational.builder;

public class ActualBuilder extends Builder{
    private Computer computer = new Computer();

    public void buildCPU(String cpu) {
        computer.setCpu(cpu);
    }

    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    public void buildHardDisk(String hardDisk) {
        computer.setHardDisk(hardDisk);
    }

    public void buildDisplayCard(String displayCard) {
        computer.setDisplayCard(displayCard);
    }

    public void buildPower(String power) {
        computer.setPower(power);
    }

    public void buildMemory(String memory) {
        computer.setMemory(memory);
    }

    public Computer createComputer() {
        return computer;
    }
}
