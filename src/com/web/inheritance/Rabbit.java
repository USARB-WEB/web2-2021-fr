package com.web.inheritance;

public class Rabbit extends Animal{
    public void move(){
        if(this.age < 50) {
            System.out.println(this.name + " move");
        } else {
            System.out.println(this.name + " die and can't move");
        }
    }
}
