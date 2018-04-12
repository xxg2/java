package com.tom.genericity;

//public class MyClass implements MinMax<T> wrong
//public class MyClass implements MinMax<Integer> OK 具体类型的泛型接口
public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }

    @Override
    public T min() {
        T v = vals[0];
        for (int i=1;i<vals.length;i++) {
            if(vals[i].compareTo(v)<0) {
                v = vals[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i=1;i<vals.length;i++) {
            if(vals[i].compareTo(v)>0) {
                v = vals[i];
            }
        }
        return v;
    }
}
