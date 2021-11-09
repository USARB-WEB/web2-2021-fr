package com.web.abstract_class;

public abstract class Transport {
    String type;

    void startEngine(){
        System.out.println(this.type + " Engine started");
    }

    void move(){
        System.out.println(this.type + " move");
    }

    void stopEngine(){
        System.out.println(this.type + " Engine stopped");
    }
}
