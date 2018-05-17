package com.tom.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        Integer[] ia = new Integer[list.size()];
        ia = list.toArray(ia);

        int sum = 0;
        for (int i: ia)
            sum += i;
        System.out.println("sum is: " + sum);
    }
}
