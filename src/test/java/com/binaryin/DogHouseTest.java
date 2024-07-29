package com.binaryin;

import org.junit.jupiter.api.Test;

public class DogHouseTest {

    @Test
    public void SimpleTest(){
        DogHouse dogHouse = new DogHouse();
        System.out.println(dogHouse.isDogInHouse());
    }
}
