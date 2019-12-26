package com.java8demo.streams05;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// steam
// foreach
public class Demo1 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> collect = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        //collect.forEach(System.out::println);
        collect.stream().forEach(x -> System.out.println(x));
    }
}
