package com.tom.string;

public class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
