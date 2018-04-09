package com.tom.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno3(str = "First", val = -1)
    @MyAnno3(str = "Second", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println("method not found. ");
        }
    }

    public static void main(String[] args) {
        RepeatAnno.myMeth("test", 10);
    }
}