package com.java8demo.streams05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
//parallelStream 并行
public class Demo5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        Stream<String> stringStream = strings.parallelStream().filter(string -> string.isEmpty());
        long count = stringStream.count();
        System.out.println(count);
    }
}
