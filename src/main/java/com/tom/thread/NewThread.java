package com.tom.thread;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo Thread");
        System.out.println("child thread:" + t);
        t.start();
    }
    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println("child thread: "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("child interrupted. ");
        }
    }

    public static void main(String[] args) {
        new NewThread();
        try {
            for(int i=5;i>0;i--) {
                System.out.println("main thread: "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");
    }
}
