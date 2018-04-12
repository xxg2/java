package com.tom.genericity;

public class Gen3<T, V> extends Gen2<T> {
    V ob2;

    Gen3(T o, V ob2) {
        super(o);
        ob2 = ob2;
    }

    V getOb2() {
        return ob2;
    }
}
