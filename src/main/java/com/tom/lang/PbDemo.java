package com.tom.lang;

public class PbDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("sublime", "testfile");
            pb.start();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
