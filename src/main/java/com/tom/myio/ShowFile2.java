package com.tom.myio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        if(args.length != 1) {
            System.out.println("usage showfile filename");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) {
            do {
                i = fin.read();
                if(i !=-1) System.out.println(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("an error occurred");
        }
    }
}