package com.katreinhart;

/**
 * Created by kat on 7/14/17.
 */
public class Link {
    public long dData;
    public Link next;

    public Link(long dd) {
        dData = dd;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}
