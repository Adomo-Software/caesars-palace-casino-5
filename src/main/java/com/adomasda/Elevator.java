package com.adomasda;

import java.util.List;
import java.util.Map;

public interface Elevator {
    void goToFloor(int floor, List<Floor> floors) throws FloorUnderContructionException;
    void getFloorMap(Map<Integer, Floor> floorMap);
}
