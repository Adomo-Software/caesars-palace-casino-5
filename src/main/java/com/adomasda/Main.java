package com.adomasda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Config {
    private final int floorNumber;
    private final String label;

    public Config(int floorNumber, String label) {
        this.floorNumber = floorNumber;
        this.label = label;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public String getLabel() {
        return label;
    }
}

interface Elevator {
    void goToFloor(Floor floor, List<Floor> floors);
}

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

    public void goToFloor(Floor floor) {
        elevator.goToFloor(floor, floors);
    }
}
class Floor {
    private final Config configuration;

    public Floor(Config configuration) {
        this.configuration = configuration;
    }

    public int getFloorNumber() {
        return configuration.getFloorNumber();
    }

    public String getLabel() {
        return configuration.getLabel();
    }
}

class RedElevator implements Elevator {
    @Override
    public void goToFloor(Floor floor, List<Floor> floors) {
        try {
            int floorNum = Integer.parseInt(floor.getLabel());
            int i;
            for (i = 0; floors.get(i) != floor ; i++) {
                System.out.println(floors.get(i).getLabel());
            }
            System.out.println(floors.get(i).getLabel());
        } catch (NumberFormatException nfe) {
            System.out.println("Floor is under construction");
        }
    }
}

class GreenElevator {
    // TODO
}

public class Main {
    public static void main(String[] args) throws Exception {
        Floor floor1 = new Floor(new Config(1, "1"));
        Floor floor2 = new Floor(new Config(2, "2"));
        Floor floor3 = new Floor(new Config(3, "under construction"));
        Floor floor4 = new Floor(new Config(4, "4"));
        Casino redCasino = new Casino(new RedElevator(), floor1, floor2, floor3, floor4);
        redCasino.goToFloor(floor4);
    }
}
