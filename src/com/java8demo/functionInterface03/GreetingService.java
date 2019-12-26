package com.java8demo.functionInterface03;

import java.util.function.BinaryOperator;

@FunctionalInterface
public interface GreetingService {
    void sayMessage(String message);

    public static void main(String[] args) {
        GreetingService greetingService1 =  message -> System.out.println("Hello "+ message);
//      new GreetingService().sayMessage(essage -> System.out.println("Hello "+ message));
        greetingService1.sayMessage("中国");

    }
}
