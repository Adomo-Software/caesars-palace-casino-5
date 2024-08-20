package com.adomasda;

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
