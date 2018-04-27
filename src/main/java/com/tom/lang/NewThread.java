package com.tom.lang;

public class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        System.out.println(this);
        suspendFlag = false;
        start();
    }

    public void run() {
        try {
            for(int i=5;i>0;i--) {
                System.out.println(getName());
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(getName());
        }
        System.out.println(getName() + "exit");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }

    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group a");
        ThreadGroup groupB = new ThreadGroup("Group b");
        NewThread ob1 = new NewThread("one", groupA);
        NewThread ob2 = new NewThread("two", groupA);
        NewThread ob3 = new NewThread("three", groupB);
        NewThread ob4 = new NewThread("four", groupB);

        System.out.println("here is output from list");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("suspending group a");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for(int i=0;i<tga.length;i++) {
            ((NewThread)tga[i]).mysuspend();;
        }
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("resuming group a ");
        for (int i=0;i<tga.length;i++) {
            ((NewThread)tga[i]).myresume();
        }

        try {
            System.out.println("waiting for theads to finish");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Exception in main thead");
        }
        System.out.println("main thread exiting");
    }
}
