package com.tom.lambda;

public class VarCapture {
    public static void main(String[] args) {
        int num = 10;
        MyFunc mylambda = (n) -> {
          int v = num + n;
          //The following is illegal because it attemps to modify the value of num.
//          num++;
          return v;
        };
    }
}
