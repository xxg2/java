package com.tom.lambda;

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc5<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc5<MyClass2<Double>, Double> myClassCons = MyClass2<Double>::new;
        MyClass2<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println(mc.getVal());

        MyFunc5<MyClass3, String> myClassCons2 = MyClass3::new;
        MyClass3 mc2 = myClassFactory(myClassCons2, "lambda");
        System.out.println(mc2.getVal());
    }
}
