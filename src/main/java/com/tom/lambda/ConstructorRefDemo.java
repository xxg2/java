package com.tom.lambda;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myFunc = MyClass::new;
        MyClass mc = myFunc.func(100);
        System.out.println(mc.getVal());
    }
}
