package com.tom.thread;

public class NewThread2 implements Runnable{
    String name;
    Thread t;

    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("new thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println(name+": "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name+" exiting. ");
    }

    public static void main(String[] args) {
        new NewThread2("one");
        new NewThread2("Two");
        new NewThread2("Three");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("Main thread exiting. ");
    }
}
