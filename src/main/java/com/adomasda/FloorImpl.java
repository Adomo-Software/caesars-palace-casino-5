package com.adomasda;

public class FloorImpl implements Floor{
    private final Config configuration;

    public FloorImpl(Config configuration) {
        this.configuration = configuration;
    }

    @Override
    public String getLabel() {
        return configuration.getLabel();
    }
}
