package ru.sbt.course.Jit_GC;

import java.util.HashMap;
import java.util.Map;

/**
 * Задание по 16 лекции СБТ. JVM, JIT, GC.
 * 
 * @author Hin7 
 * @version 1.0 01/06/2020
 */


public class BigMap {
    public static void main(String[] args) {
        Map<Integer, String> bigMap = new HashMap<>();

        for (int i = 0; i < 100_000; i++) {
            bigMap.put(i, "value" + i);
        }

        System.out.println("Закончили заполнение bigMap");
    }
}
