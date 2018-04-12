package com.tom.genericity;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3,6,2,8,6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("max value in inums: " + iob.max());
        System.out.println("min value in inums: " + iob.min());

        System.out.println("max value in chs: " + iob.max());
        System.out.println("min value in chs: " + iob.min());
    }
}
