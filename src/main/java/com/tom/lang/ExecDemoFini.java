package com.tom.lang;

public class ExecDemoFini {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec("ls");
            p.waitFor();
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("returned " + p.exitValue());
    }
}
