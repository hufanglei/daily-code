package com.java8demo.lambda01;

/**
 * lambda表达式的语法
 *    - 1. 4种可以简写的方式  简写参数类型，简写参数括号，简写方法主体的大括号,简写返回值，
 *    - 2. 自定义方法类型接口：类似js的回调函数，比js笨重，需要，指定回调函数名和方法名，而js不需要
 */
public class Demo1 {
    public static void main(String[] args) {
        //参数
        // 1. 不需要参数,返回值为 5
        //Callable<Integer> integerCallable = () -> 5;
        // 2. 接收一个参数(数字类型),返回其2倍的值
        // x ->  (2*x);
        // 3. 接受2个参数(数字),并返回他们的差值
        // (x, y) -> x – y;
        // 4. 接收2个int型整数,返回他们的和
       // IntBinaryOperator intBinaryOperator = (int x, int y) -> x + y;
        // 5. 接受一个 string 对象,并在控制台打印,不返回任何值(看起来像是返回void)
        //Consumer<String> stringConsumer = (String s) -> System.out.print(s);

        Demo1 tester = new Demo1();
        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + operate(10, 5, addition));

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> { return a * b; };
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));
        System.out.println("10 / 5 = " + division.operation(10, 5));

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);
        greetService1.sayMessage("Runoob");

        //用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);
        greetService2.sayMessage("Google");

    }
    interface MathOperation{
        int operation(int a, int b);
    }
    interface GreetingService {
        void sayMessage(String message);
    }

    static int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
