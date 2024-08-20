package com.adomasda;

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
