package com.tom.enumeration;

import java.lang.annotation.Annotation;

public class TestClass {
    public static void main(String[] args) {
        Apple ap = Apple.GoldenDel;
        switch (ap) {
            case Jonathan:
                break;
            case GoldenDel:
                break;
            default:
                break;
        }

        Apple allapples[] = Apple.values();
        for(Apple a: allapples) {
            System.out.println(a);
            System.out.println(a.ordinal());
        }

        Integer i;
        Byte b;
        Float f;
        Annotation a;
    }
}
