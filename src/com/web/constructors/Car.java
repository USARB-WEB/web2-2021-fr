package com.web.constructors;

public class Car {
    private String color;
    Car(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
