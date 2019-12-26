package com.java8demo.NashornJs07;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

//Java 中调用 JavaScript
public class Demo1 {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        final ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        String name = "Runoob";
        Integer result = null;
        try {
            nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());

    }
}
