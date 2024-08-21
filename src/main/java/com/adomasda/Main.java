package com.adomasda;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Red Casino:");
        Floor floor1 = new AvailableFloor(new Config(1, "1"));
        Floor floor2 = new AvailableFloor(new Config(2, "2"));
        Floor floor3 = new UnavailableFloor(new Config(3, "under construction"));
        Floor floor4 = new AvailableFloor(new Config(4, "4"));
        Casino redCasino = new Casino(new RedElevator(), floor1, floor2, floor3, floor4);
        redCasino.goToFloor(4);
        System.out.println("user construction case:");
        redCasino.goToFloor(3);
        List<String> list = new ArrayList<>();

        Casino greenCasino = new Casino(new GreenElevator(), floor1, floor2, floor3, floor4);

        System.out.println();
        System.out.println("Green Casino:");
        greenCasino.goToFloor(4);
        System.out.println("user construction case:");
        greenCasino.goToFloor(3);

    }
}