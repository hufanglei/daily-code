package com.java8demo.lambda01;

/**
 * 变量作用域
 * lambda 表达式只能引用标记了 final 的外层局部变量
 * final在外部
 */
public class Demo2 {
    final static String salutation = "Hello!";

    public static void main(String[] args) {
        GreetingService greetService1 = message ->
                System.out.println(salutation + message);
        greetService1.sayMessage("hfl");
    }
    interface GreetingService{
        void sayMessage(String message);
    }
}
