package com.tom.thread;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("suspending thread one");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread one");
            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("suspending thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("resuming thread two");
        } catch (InterruptedException e) {
            System.out.println("main thread interruped");
        }

        try {
            System.out.println("waiting for threads to finish");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting.");
    }
}
