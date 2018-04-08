package com.tom.thread;

public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B interruped");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside B.last");
    }
}