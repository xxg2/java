package com.tom.myio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if(args.length !=-1) {
            System.out.println("usage: showfile filename");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("cannot open file");
            return;
        }

        try {
            do {
                i = fin.read();
                if(i != -1) System.out.println(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("error reading file");
        }

        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("error closing file");
        }
    }
}
