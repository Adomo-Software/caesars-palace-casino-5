package com.adomasda;

import java.util.Map;

class AvailableFloor implements Floor {

    private final Config configuration;

    public AvailableFloor(Config configuration) {
        this.configuration = configuration;
    }

    @Override
    public Config getConfig() {
        return this.configuration;
    }

    @Override
    public Integer getFloorNumber() {
        return this.configuration.getNumber();
    }

    @Override
    public String enter() {
        return Integer.toString(this.configuration.getNumber());
    }


    @Override
    public void address(Map<Integer, Floor> floorMap) {
        floorMap.put(this.getConfig().getNumber(), this);
    }
}
