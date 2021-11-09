package com.web.interfaces;

public class CoffeeMachine implements CoffeeMachineInterface{
    public void makeCoffee(){
        this.grindGrain();
        this.boilWater();
        this.addSugar();
        System.out.println("Coffee prepared");
    }

    void grindGrain(){
        System.out.println("Grind grain done");
    }

    void boilWater(){
        System.out.println("Water boiled");
    }

    void addSugar(){
        System.out.println("Sugar added");
    }
}
