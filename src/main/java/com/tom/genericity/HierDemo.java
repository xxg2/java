package com.tom.genericity;

public class HierDemo {
    public static void main(String[] args) {
        Gen3<String, Integer> x = new Gen3<>("value is ", 99);
        System.out.println(x.getob());
        System.out.println(x.getOb2());
    }
}
