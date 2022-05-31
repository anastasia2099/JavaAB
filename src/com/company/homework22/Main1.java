package com.company.homework22;

public class Main1 {
    public static void main (String[] args) {
        //DancingRobot dancingRobot = new BaletDancingRobot();
       // DancingRobot dancingRobot1 = new FalkDancingRobot();
        printRobot(new BaletDancingRobot());
        printRobot(new FalkDancingRobot());


    }
private static void printRobot (DancingRobot robot){
    System.out.println("Dance Type1: " + robot.getDancetype1());
    System.out.println("Dance Type2: " + robot.getDancetype2());

}
}
