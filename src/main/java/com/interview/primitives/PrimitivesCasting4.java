package com.interview.primitives;

public class PrimitivesCasting4 {

    static int someInt = 0;
    static double someDouble = 1.6;

    public static void main(String[] args) {

        someInt = (int) someDouble;
        System.out.println(someInt);


    }
}
