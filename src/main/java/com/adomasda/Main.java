package com.adomasda;


public class Main {
    public static void main(String[] args) throws Exception {
        Floor floor1 = new Floor(new Config(1, "1"));
        Floor floor2 = new Floor(new Config(2, "2"));
        Floor floor3 = new Floor(new Config(3, "under construction"));
        Floor floor4 = new Floor(new Config(4, "4"));
        Casino redCasino = new Casino(new RedElevator(), floor1, floor2, floor3, floor4);
        redCasino.goToFloor(4);
        System.out.println("user construction case:");
        redCasino.goToFloor(3);
    }
}