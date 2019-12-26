package com.java8demo.defaultmethods04;

public class Car implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
    }


    public static void main(String[] args) {
        new Car().print();
    }
}
