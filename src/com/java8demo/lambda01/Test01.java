package com.java8demo.lambda01;

/**
 * lambda简化匿名内部类案例:
 * lambda实现runable接口
 *
 * 深入解析:
 * 本质:
 * 在匿名内部类中，有很多内容都是冗余的。
 *
 * 比如在使用匿名内部类实现多线程的代码中。
 *
 *  因为 Thread 构造方法中需要传递 Runnable 接口类型的参数，所以我们不得不 new Runnable。
 *  因为要重写 Runnable 中的 run 方法，所以不得不写了public void run。
 * 整个匿名内部类中最关键的东西是方法，方法中最关键的有前中后三点。
 *
 *  前：参数。
 *  中：方法体
 *  后：返回值
 * 最好的情况是只关注匿名内部类中最核心的这些内容（方法参数，方法体，返回值）如果使用Lambda表达式，可以只关注最核心的内容，Lambda 表达式是匿名内部类的简化写法。
 */
public class Test01 {

    public static void main(String[] args) {
        //java7
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();

        //java8写法
        new Thread(() -> System.out.println("hello world")).start();


    }
}
