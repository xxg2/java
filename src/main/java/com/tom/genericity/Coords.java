package com.tom.genericity;

public class Coords<T extends TwoGen> {
    T[] coords;
    Coords(T[] o) {
        this.coords = o;
    }

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates:");
        for(int i=0;i<c.coords.length;i++) {
//            System.out.println(c.coords[i].x + " " + c.coords.y);
        }
        System.out.println();
    }
}
