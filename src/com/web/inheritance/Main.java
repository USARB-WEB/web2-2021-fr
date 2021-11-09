package com.web.inheritance;

public class Main {
    public static void main(String[] args) {
        Rabbit bugsBunny = new Rabbit();
        bugsBunny.name = "Bugs Bunny";
        bugsBunny.age = 3;
        bugsBunny.eat();
        bugsBunny.move();
        bugsBunny.sleep();


        Wolf grayWolf = new Wolf();
        grayWolf.name = "Gray Wolf";
        grayWolf.age = 99;
        grayWolf.eat();
        grayWolf.age = 99;
        grayWolf.move();
        grayWolf.sleep();

    }
}
