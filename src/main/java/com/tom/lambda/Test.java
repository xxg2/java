package com.tom.lambda;

public class Test {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        MyNumber myNum = () -> 123.4;
        System.out.println(myNum.getValue());

        NumericTest isEven = (n) -> (n%2) == 0;

        NumericTest2 isFactor = (n, d)-> (n%d) == 0;

        if(isFactor.test(10,2))
            System.out.println("2 is a factor of 10");
        if(!isFactor.test(10,3))
            System.out.println("3 is not a factor of 10");
        //-----------------------------
        NumericFunc func = (n) -> {
          int result = 1;
          for(int i=1;i<=n;i++)
              result = i* result;
          return result;
        };
        System.out.println(func.func(3));

        //-----------------------------
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for(i = str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(reverse.func("lambda"));
        System.out.println(reverse.func("Expression"));

        //-----------------------------
        SomeFunc<String> reverse2 = (str) -> {
            String result = "";
            int i;
            for(i=str.length()-1;i>=0;i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println(reverse2.func("lambda"));

        //-----------------------------
        String inStr = "lambdas add power to Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("The string in uppercase: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            int i;
            for(i=0;i<str.length();i++) {
                if(str.charAt(i) != ' ')
                    result += str.charAt(i);
            }
            return result;
        }, inStr);
        System.out.println(outStr);

        StringFunc reverse3 = (str) -> {
            String result = "";
            int i;
            for(i=str.length()-1;i>=0;i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(stringOp(reverse3, inStr));
    }
}
