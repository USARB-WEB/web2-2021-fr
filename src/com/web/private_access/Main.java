package com.web.private_access;

public class Main {
    public static void main(String[] args){
        Student studentIon = new Student();
        studentIon.setName("Ion");
        System.out.println(studentIon.getName());
        studentIon.birthYear = 1994;
        studentIon.calculateAge();
        System.out.println(studentIon.birthYear);
        System.out.println(studentIon.getAge());

    }
}
