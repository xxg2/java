package com.tom.thread;

public class NewThread3 implements Runnable {
    String name;
    Thread t;

    NewThread3(String threadName) {
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
        NewThread3 obj1 = new NewThread3("one");
        NewThread3 obj2 = new NewThread3("Two");
        NewThread3 obj3 = new NewThread3("Three");
        try {
            System.out.println("waiting for threads to finish. ");
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("Main thread exiting. ");
    }
}
