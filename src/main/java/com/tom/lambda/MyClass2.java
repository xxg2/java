package com.tom.lambda;

public class MyClass2<T> {
    private T val;
    MyClass2(T v) {
        val = v;
    }

    MyClass2() {
        val = null;
    }

    T getVal() {
        return val;
    }
}
