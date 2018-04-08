package com.tom.thread;

public class Consumer2 implements Runnable {
    Q2 q;

    Consumer2(Q2 q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

    public static void main(String[] args) {
        Q2 q = new Q2();
        new Producer2(q);
        new Consumer2(q);
        System.out.println("Press Control-C to stop. ");
    }
}
