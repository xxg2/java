package com.tom.anno;

import java.lang.annotation.RetentionPolicy;

public class Test {
    @MyAnno(str = "", val = 100)
    public static void myMeth() {
        RetentionPolicy p;
    }
}
