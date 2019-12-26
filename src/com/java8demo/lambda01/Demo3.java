package com.java8demo.lambda01;

/**
 * 变量作用域
 * 内部final变量访问
 * - 1.lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
 * - 2,.在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
 */
public class Demo3 {
    public static void main(String[] args) {
        final int num = 1;
        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
        s.convert(2);

    }
     interface Converter<T1, T2>{
        void convert(int i);
    }
    static  void test(Converter converter){

    }
}
