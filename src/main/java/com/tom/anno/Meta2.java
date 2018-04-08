package com.tom.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@What(description = "An annotation test class")
@MyAnno(str = "meta2", val = 99)
public class Meta2 {
    @What(description = "an annotation test method")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {
        Meta2 ob = new Meta2();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("all annotations for meta2");
            for(Annotation anno : annos) {
                System.out.println(anno);
            }
            System.out.println();
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("all annotations for myMeth");
            for(Annotation a : annos) {
                System.out.println(a);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("method not found");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
