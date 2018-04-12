package com.tom.genericity;

public class Gen2<T> {
    T ob;
    Gen2(T o) {
        ob = o;
    }

    T getob() {
        return ob;
    }
}
