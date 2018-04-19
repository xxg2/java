package com.tom.genericity;

public class Gen5<T extends Number> {
    T ob;
    T vals[];
    Gen5(T o, T[] nums) {
        ob = o;
//        vals = new T[10]; cannot create an array of T
        vals = nums; //OK to assign reference to existent array
    }

    public static void main(String[] args) {
        Integer[] n = {1,2,3,4,5};
        Gen5<Integer> iob = new Gen5<>(50, n);
//        Gen5<Integer> gens[] = new Gen5<>[10]; wrong
        Gen5<?> gens[] = new Gen5<?>[10];
    }
}
