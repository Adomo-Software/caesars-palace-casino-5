package com.adomasda;

class Floor {
    private final Config configuration;

    public Floor(Config configuration) {
        this.configuration = configuration;
    }

    public String getLabel() {
        return configuration.getLabel();
    }
}
