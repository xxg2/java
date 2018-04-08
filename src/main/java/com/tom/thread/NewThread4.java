package com.tom.thread;

public class NewThread4 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread4(String threadname) {
        this.name = threadname;
        this.t = new Thread(this, name);
        System.out.println("new thread: " + t);
        suspendFlag = false;
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=15;i>0;i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted. ");
        }
        System.out.println(name + " exiting.");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}
