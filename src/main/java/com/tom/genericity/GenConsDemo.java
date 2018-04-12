package com.tom.genericity;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5f);
        test.showval();
        test2.showval();
    }
}
