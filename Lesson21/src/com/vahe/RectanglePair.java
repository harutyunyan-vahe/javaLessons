package com.vahe;

public class RectanglePair {
    private Rectangle first;
    private Rectangle second;

    public RectanglePair(Rectangle first, Rectangle second) {
        this.first = first;
        this.second = second;
    }

    public Rectangle getFirst() {
        return first;
    }

    public void setFirst(Rectangle first) {
        this.first = first;
    }

    public Rectangle getSecond() {
        return second;
    }

    public void setSecond(Rectangle second) {
        this.second = second;
    }
}
