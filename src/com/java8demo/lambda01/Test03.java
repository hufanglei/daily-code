package com.java8demo.lambda01;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * 使用 Lambda 表达式对中文排序：
 */
public class Test03 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("谷歌", "腾讯", "百度", "淘宝");
        Collator collator = Collator.getInstance(Locale.CHINA);
        list.sort((s1, s2) -> collator.compare(s1, s2));
        System.out.println(list);
    }
}
