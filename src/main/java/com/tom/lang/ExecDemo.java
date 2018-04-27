package com.tom.lang;

public class ExecDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("ls");
            System.out.println(p.getOutputStream());
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
