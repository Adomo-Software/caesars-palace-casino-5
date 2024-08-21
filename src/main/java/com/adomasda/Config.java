package com.adomasda;

public class Config {
    private final Integer number;
    private final String label;

    public Config(Integer number, String label) {
        this.label = label;
        this.number = number;
    }

    public String getLabel() {
        return label;
    }

    public Integer getNumber() {
        return number;
    }
}
