package com.tom.enumeration;

public enum  Apple2 {
    Jonathan(10), GoldenDel(9);

    private int price;

    Apple2(int p) {
        this.price = p;
    }

    int getPrice() {
        return price;
    }
}
