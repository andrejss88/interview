package com.interview.oo;

public class Student {

    public String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public String toString(String name){
        return "Name: " + name;
    }
}
