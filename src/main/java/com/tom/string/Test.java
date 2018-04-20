package com.tom.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
//        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
//        String s = new String(chars, 2,3);
//        System.out.println(s);
//
//        byte[] ascii = {65,66,67,68,69,70};
//        String s1 = new String(ascii);
//        System.out.println(s1);
//        String s2 = new String(ascii, 2, 3);
//        System.out.println(s2);
//
//        String str;
//        StringBuilder sb;
//        StringBuffer sbf;
//
//        Box b = new Box(10 ,12, 14);
//        String s3 = "box b: " + b;
//        System.out.println(b);
//        System.out.println(s3);
//
//        String s4 = "this is a demo of the getchars method. ";
//        int start = 10;
//        int end = 14;
//        char[] buf = new char[end-start];
//        s4.getChars(start, end, buf, 0);
//        System.out.println(buf);
//
//        String arr[] = {"Now", "is", "the", "time", "for", "all", "good", "men", "to", "come", "to", "the", "aid", "of", "their", "country"};
//        for(int j=0;j<arr.length;j++) {
//            for(int i=j+1;i<args.length;i++) {
//                if(arr[i].compareTo(arr[j])<0) {
//                    String t = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = t;
//                }
//            }
//        }
//
//        String s5 = "Now is the time for all good men to come to the aid for their country.";
//        System.out.println(s5);
//        System.out.println("indexOf(t)="+s.indexOf('t'));
//        System.out.println("lastIndexOf(t)="+s.lastIndexOf('t'));
//        System.out.println("indexOf(the)="+s.indexOf("the"));
//        System.out.println("lastIndexOf(the)="+s.lastIndexOf("the"));
//        System.out.println("indexOf(t, 10)="+s.indexOf('t', 10));
//        System.out.println("lastIndexOf(t, 60)="+s.lastIndexOf('t', 60));
//
//        String org = "This is a test. This is, too.";
//        String search = "is";
//        String sub = "was";
//        String result = "";
//        int i;
//        do {
//            System.out.println(org);
//            i = org.indexOf(search);
//            if(i != -1) {
//                result = org.substring(0, i);
//                result = result + sub;
//                result = result + org.substring(i + search.length());
//                org = result;
//            }
//        } while (i != -1);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str;
//        System.out.println("enter 'stop' to quit. ");
//        System.out.println("Enter State: ");
//        do {
//            str = br.readLine();
//            str = str.trim();
//            if(str.equals("Illinois"))
//                System.out.println("capital is springfield.");
//            else if(str.equals("Missouri"))
//                System.out.println("capital is Jefferson City.");
//            else if(str.equals("California"))
//                System.out.println("capital is Sacramento.");
//            else if(str.equals("Washington"))
//                System.out.println("capital is Olympia.");
//        } while (!str.equals("stop"));

//        String result = String.join(" ", "Alpha", "Beta", "Gamma");
//        System.out.println(result);
//
//        result = String.join(", ", "John", "ID#: 569", "E-mail: John@HerbSchildt.com");
//        System.out.println(result);

//        StringBuffer sb = new StringBuffer("hello");
//        System.out.println("buffer="+sb);
//        System.out.println("length="+sb.length());
//        System.out.println("capacity="+sb.capacity());
//        sb.ensureCapacity(55);
//        System.out.println("capacity="+sb.capacity());
//        sb.setLength(15);
//        System.out.println("buffer="+sb);
//        System.out.println("length="+sb.length());

//        StringBuffer sb = new StringBuffer("hello");
//        System.out.println("buffer before "+sb);
//        System.out.println("charAt(1) before "+sb.charAt(1));
//        sb.setCharAt(1, 'i');
//        sb.setLength(2);
//        System.out.println("buffer after "+sb);
//        System.out.println("charAt(1) after " + sb.charAt(1));

//        String s;
//        int a = 42;
//        StringBuffer sb = new StringBuffer(40);
//        s = sb.append("a=").append(a).append("!").toString();
//        System.out.println(s);
//        System.out.println(s.length());

//        StringBuffer sb = new StringBuffer("I java");
//        sb.insert(2, "like ");
//        System.out.println(sb);

        StringBuffer s = new StringBuffer("abcde");
        System.out.println(s);
        s.reverse();
        System.out.println(s);

        StringBuffer sb = new StringBuffer("this is a test");
        sb.delete(4,7);
        System.out.println("after delete " + sb);
        sb.deleteCharAt(0);
        System.out.println("after deletecharat: " +sb);
    }
}
