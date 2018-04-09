package com.tom.anno;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
public @interface MyAnno3 {
    String str() default "testing";
    int val() default 9000;
}
