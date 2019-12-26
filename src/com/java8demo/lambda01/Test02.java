package com.java8demo.lambda01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * lambda 实现集合排序
 */
public class Test02 {
    public static void main(String[] args) {
        String[] players = {"Rafael Nadal", "Novak Djokovic",
                "Stanislas Wawrinka", "David Ferrer",
                "Roger Federer", "Andy Murray",
                "Tomas Berdych", "Juan Martin Del Potro",
                "Richard Gasquet", "John Isner"};
        //JDK7写法
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Arrays.stream(players).forEach(s -> System.out.print(s +  " " ));

        System.out.println();
        //JDK8
        Arrays.stream(players).sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s +  " " ));
        System.out.println();
        Arrays.sort(players, Comparator.naturalOrder());
        Arrays.stream(players).forEach(s -> System.out.print(s +  " " ));
        System.out.println();
        Arrays.stream(players).sorted(Comparator.reverseOrder()).forEach(s -> System.out.print(s +  " " ));
        System.out.println();
        Arrays.stream(players).sorted().forEach(s -> System.out.print(s +  " " ));


    }
}
