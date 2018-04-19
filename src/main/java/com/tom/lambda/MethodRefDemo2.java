package com.tom.lambda;

public class MethodRefDemo2 {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda add power to Java";
        String outStr;

        MyStringOps2 strOps = new MyStringOps2();
        outStr = stringOp(strOps::strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);
    }
}
