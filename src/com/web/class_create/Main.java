package com.web.class_create;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
        ClassExample classExample = new ClassExample();
        System.out.println(classExample.name);
        classExample.name = "Ion";
        System.out.println(classExample.name);
        System.out.println(classExample.calculate(2, 3));
    }
}
