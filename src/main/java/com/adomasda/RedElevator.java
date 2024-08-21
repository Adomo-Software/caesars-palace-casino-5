package com.adomasda;

import java.util.List;

public class RedElevator implements Elevator {
    @Override
    public void goToFloor(int floor, List<Floor> floors) {
        try {
            Integer.parseInt(floors.get(floor - 1).getLabel());
            for (int i = 0; i < floors.size(); i++) {
                System.out.println(floors.get(i).getLabel());
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Floor is under construction");
        }
    }
}
