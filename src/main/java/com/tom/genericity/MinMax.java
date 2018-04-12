package com.tom.genericity;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
