package com.adomasda;

import java.util.Map;

public interface Floor {
    Config getConfig();

    Integer getFloorNumber() throws FloorUnderContructionException;

    void address(Map<Integer, Floor> floorMap);

    String enter();
}

