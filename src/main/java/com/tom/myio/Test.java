package com.tom.myio;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //字节流类。由InputStream和OutputStream派生
        InputStream is;
        OutputStream os;
        BufferedInputStream bis;
        BufferedOutputStream bos;
        ByteArrayInputStream bais;
        ByteArrayOutputStream baos;
        DataInputStream dis;
        DataOutputStream dos;
        FileInputStream fis;
        FileOutputStream fos;

        FilterInputStream ftis;
        FilterOutputStream ftos;

        ObjectInputStream ois;
        ObjectOutputStream oos;

        PipedInputStream pis;
        PipedOutputStream pos;

        PrintStream ps;
        PushbackInputStream pbis;
        SequenceInputStream sis;

        //字符流类
        BufferedReader br;
        BufferedWriter bw;
        CharArrayReader car;
        CharArrayWriter caw;
        FileReader fr;
        FileWriter fw;
        FilterReader ftr;
        FilterWriter ftw;
        InputStreamReader isr;
        LineNumberReader lnr;
        OutputStreamWriter osw;
        PipedReader pr;
        PipedWriter pw;
        PrintWriter prw;
        PushbackReader pbr;
        Reader r;
        StringReader sr;
        StringWriter sw;
        Writer w;
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
    }
}
