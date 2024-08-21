package com.adomasda;

import java.util.Arrays;
import java.util.List;

class Casino {
    private final List<Floor> floors;
    private final Elevator elevator;

    public Casino(Elevator elevator, Floor... floors) {
        this.elevator = elevator;
        this.floors = Arrays.asList(floors);
    }

    public void goToFloor(int floor) {
        elevator.goToFloor(floor, floors);
    }
}
