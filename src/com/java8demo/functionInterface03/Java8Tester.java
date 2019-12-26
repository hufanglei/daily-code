package com.java8demo.functionInterface03;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true
//        System.out.println("输出所有数据:");
//        eval(list, integer -> true);
//        Predicate<Integer> predicate = n -> n % 2 == 0;
//        eval(list, predicate);
        System.out.println("输出所有偶数:");
        eval(list, n -> n % 2 == 0);
        System.out.println("输出大于 3 的所有数字:");
        eval(list, n-> n > 3 );
        System.out.println("输出大于 3 的所有数字:");
        //可以不用定义 eval 函数，使用:
        list.stream().filter(n-> n > 3).forEach(System.out::println);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {

            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
    public static void eval2(List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
//        for (Integer n : list) {
//
//            if (predicate.test(n)) {
//                System.out.println(n + " ");
//            }
//        }
    }
}
