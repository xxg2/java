package com.tom.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass((1)));
        list.add(new MyClass((4)));
        list.add(new MyClass((2)));
        list.add(new MyClass((9)));
        list.add(new MyClass((3)));
        list.add(new MyClass((7)));

        //MyClass既没有定义自己的比较方法，也没有实现Comparator接口。但是通过max()方法，仍然可以获得
        //MyClass对象的最大值，因为UseMethodRef定义了静态方法CompareMC(),他与Comparator定义的compare()方法兼容
        MyClass maxValObj = Collections.max(list, UseMethodRef::compareMC);
        System.out.println(maxValObj.getVal());
    }
}
