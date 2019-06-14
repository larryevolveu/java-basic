package com.evolveu.shape;

public abstract class Shape extends Line {

    private static int count = 0;

    public Shape() {
        System.out.println("In Shape Constructor");
        this.count++;
    }

    public abstract double area();

//    public abstract double perimeter();

    public String doSomething() {
        return "stuff";
    }

}
