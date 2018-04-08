package com.tom.thread;

public class Caller2 implements Runnable {
    String msg;
    Callme target;
    Thread t;
    Object obj;

    public Caller2(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
