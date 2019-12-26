package com.java8demo.methodRefence02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * 四种方法引用
 */
public class Car {
    String name;

    //Supplier是jdk1.8的接口，这里和lambda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.name);
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.name);
    }

    public void repair() {
        System.out.println("Repaired " + this.name);
    }

    public static void main(String[] args) {
        //构造器引用：

        Car car = Car.create(Car::new);
        car.name = "构造器引用";
        final List<Car> cars = Arrays.asList(car);
        //静态方法引用
        car.name = "静态方法引用";
        cars.forEach(Car::collide);
        //特定类的任意对象的方法引用
        car.name = "特定类的任意对象的方法引用";
        cars.forEach(Car::repair);
        //特定对象的方法引用
        car.name = "特定对象的方法引用";
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

    }
}
