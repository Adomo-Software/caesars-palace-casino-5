package com.adomasda;

import java.util.Map;

class UnavailableFloor implements Floor {
    private final Config configuration;

    public UnavailableFloor(Config configuration) {
        this.configuration = configuration;
    }

    @Override
    public Config getConfig() {
        return this.configuration;
    }

    @Override
    public Integer getFloorNumber() throws FloorUnderContructionException {
        throw new FloorUnderContructionException("Floor " + configuration.getNumber() + " is under construction");
    }

    @Override
    public void address(Map<Integer, Floor> floorMap) {
        floorMap.put(this.getConfig().getNumber(), this);
    }

    @Override
    public String enter() {
        return Integer.toString(this.configuration.getNumber()) + " is under construction";
    }
}
