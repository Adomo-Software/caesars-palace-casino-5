package com.adomasda;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Floor floor1 = new FloorImpl(new Config("1"));
        Floor floor2 = new FloorImpl(new Config("2"));
        Floor floor3 = new FloorImpl(new Config("under construction"));
        Floor floor4 = new FloorImpl(new Config("4"));
        Casino redCasino = new Casino(new RedElevator(), floor1, floor2, floor3, floor4);
        redCasino.goToFloor(4);
        System.out.println("user construction case:");
        redCasino.goToFloor(3);
        List<String> list = new ArrayList<>();
    }
}