package com.java8demo.streams05;

import java.util.Arrays;
import java.util.List;

// filter
//count
public class Demo3 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }
}
