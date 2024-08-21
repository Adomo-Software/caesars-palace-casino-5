package com.adomasda;

import java.util.List;
import java.util.Map;

public class RedElevator implements Elevator {
    @Override
    public void goToFloor(int floor, List<Floor> floors) {
        try {
            Integer.parseInt(floors.get(floor - 1).getConfig().getLabel());
            for (int i = 0; i < floors.size(); i++) {
                System.out.println(floors.get(i).getConfig().getLabel());
            }
        } catch (NumberFormatException nfe) {
            System.out.println("Floor is under construction");
        }
    }

    @Override
    public void getFloorMap(Map<Integer, Floor> floorMap) {
        // do nothing cause we don't need floorMap
    }
}
