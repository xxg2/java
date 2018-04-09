package com.tom.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno2 {
    String str() default "testing";
    int val() default 9000;
}
