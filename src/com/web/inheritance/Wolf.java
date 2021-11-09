package com.web.inheritance;

public class Wolf extends Animal{
    public void move(){
        if(this.age < 100) {
            System.out.println(this.name + " move");
        } else {
            System.out.println(this.name + " die and can't move");
        }
    }
}
