package com.web.constructors;

public class Main {
    public static void main(String[] args) {
        Car greenCar = new Car("Green");
        System.out.println(greenCar.getColor());

        Car blueCar = new Car("Blue");
        System.out.println(blueCar.getColor());
    }
}
