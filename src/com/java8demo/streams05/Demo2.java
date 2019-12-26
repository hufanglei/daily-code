package com.java8demo.streams05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//map
public class Demo2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
     //   numbers.stream().map(i -> i*i).distinct().forEach(System.out::println);
        List<Integer> collect = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
