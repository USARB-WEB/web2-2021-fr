package com.web.inheritance;

public class Animal {
    String name;
    Integer age;

    public void eat(){
        System.out.println(this.name + " eat");
    }

    public void move(){
        if(this.age < 100) {
            System.out.println(this.name + " move");
        } else {
            System.out.println(this.name + " die and can't move");
        }
    }

    public void sleep(){
        System.out.println(this.name + " sleep");
    }
}
