package com.adomasda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Casino {
    private final List<Floor> floors;
    private final Elevator elevator;
    Map<Integer, Floor> floorMap = new HashMap<>();

    public Casino(Elevator elevator, Floor... floors) {
        this.elevator = elevator;
        this.elevator.getFloorMap(floorMap);
        this.floors = Arrays.asList(floors);
        for (Floor floor : this.floors) {
            floor.address(floorMap);
        }
    }

    public void goToFloor(int floor) throws FloorUnderContructionException {
        elevator.goToFloor(floor, floors);
    }
}
