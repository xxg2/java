package com.tom.thread;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main Thread");
        Thread t = new Thread(this, "Racing Thread");
        t.start();
        a.foo(b);
        System.out.println("back in main thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("back in other thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
