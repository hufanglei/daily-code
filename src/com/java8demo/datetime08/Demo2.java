package com.java8demo.datetime08;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/***
 * 使用时区的日期时间API
 */
public class Demo2 {
    public static void main(String[] args) {
        new Demo2().testZonedDateTime();
    }

    public void testZonedDateTime(){
        ZonedDateTime date1  = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("date1: " + date1);

        ZoneId id = ZoneId.of("Europe/Paris");
        System.out.println("ZoneId: " + id);

         ZoneId currentZone  = ZoneId.systemDefault();
        System.out.println("当期时区: " + currentZone);


    }
}
