package com.web.private_access;

public class Student {
    private String name;
    private Integer age;
    Integer birthYear;
    String group;

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        if(name != null){
            this.name = name;
        } else {
            this.name = "Noname";
        }
    }

    public void calculateAge(){
        this.age = 2021 - this.birthYear;
    }

    public Integer getAge() {
        return age;
    }
}
