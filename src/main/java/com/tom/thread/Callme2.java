package com.tom.thread;

public class Callme2 {
    void Call(String msg) {
        System.out.print("["+msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
