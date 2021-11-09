package com.web.abstract_class;

import java.io.BufferedInputStream;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bus = new Bus();

        car.startEngine();
        car.move();
        car.stopEngine();

        bus.startEngine();
        bus.move();
        bus.stopEngine();

    }
}
