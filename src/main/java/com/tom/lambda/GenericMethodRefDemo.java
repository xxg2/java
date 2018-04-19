package com.tom.lambda;

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String[] strs = {"one", "two", "three", "two"};
        int count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println(count);

        count = myOp(MyArrayOps::<String>countMatching, strs, "two");
        System.out.println(count);
    }
}
