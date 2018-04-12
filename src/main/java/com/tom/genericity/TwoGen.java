package com.tom.genericity;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o1, V o2) {
        this.ob1 = o1;
        this.ob2 = o2;
    }

    void showTypes() {
        System.out.println("type of t is " + this.ob1.getClass().getName());
        System.out.println("Type of v is " + this.ob2.getClass().getName());
    }

    T getOb1() {
        return this.ob1;
    }

    V getOb2() {
        return this.ob2;
    }
}
