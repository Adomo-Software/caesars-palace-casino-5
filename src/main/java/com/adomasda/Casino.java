package com.adomasda;

import java.util.Arrays;
import java.util.List;

class Casino {
    private List<Floor> floors;
    private Elevator elevator;

    public void setFloors(Floor... floors) {
        this.floors = Arrays.asList(floors);
    }

    public Casino(Elevator elevator, Floor... floors) {
        this.elevator = elevator;
        this.floors = Arrays.asList(floors);
    }

    public List<Floor> getFloors() {
        return this.floors;
    }

    public void goToFloor(int floor) {
        elevator.goToFloor(floor, floors);
    }
}
