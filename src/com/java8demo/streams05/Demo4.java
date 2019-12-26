package com.java8demo.streams05;

import java.util.Random;
import java.util.stream.IntStream;
//limit
//sorted
public class Demo4 {
    public static void main(String[] args) {
        Random random = new Random();
        IntStream limit = random.ints().limit(10).sorted();
        limit.forEach(System.out::println);
    }
}
