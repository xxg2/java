package com.tom.genericity;

public class Gen4<T> extends NonGen {
    T ob;

    Gen4(T ob, int i) {
        super(i);
        ob = ob;
    }

    T getOb() {
        return ob;
    }

    public static void main(String[] args) {
        Gen4<String> w = new Gen4<>("hello", 47);
        System.out.println(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
