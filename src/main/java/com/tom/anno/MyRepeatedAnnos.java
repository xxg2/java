package com.tom.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)

public @interface MyRepeatedAnnos {
    MyAnno3[] value();
}
