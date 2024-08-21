package com.adomasda;

import java.util.List;
import java.util.Map;

public class GreenElevator implements Elevator {
    Map<Integer, Floor> floorMap;

    @Override
    public void goToFloor(int floor, List<Floor> floors) throws FloorUnderContructionException {
        floorMap.get(floors.get(floor - 1).getFloorNumber());
        for (int i = 0; i < floors.size(); i++) {
            System.out.println(floors.get(i).enter());
        }
    }

    @Override
    public void getFloorMap(Map<Integer, Floor> floorMap) {
        this.floorMap = floorMap;
    }
}
