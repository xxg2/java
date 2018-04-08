package com.tom.thread;

public class Producer2 implements Runnable {
    Q2 q;

    Producer2(Q2 q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}
