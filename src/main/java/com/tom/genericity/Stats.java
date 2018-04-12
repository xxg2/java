package com.tom.genericity;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        this.nums = o;
    }

    double average() {
        double sum = 0.0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
