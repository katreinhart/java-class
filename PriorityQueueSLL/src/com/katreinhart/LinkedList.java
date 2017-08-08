package com.katreinhart;

/**
 * Created by kat on 7/17/17.
 */
public class LinkedList {
    public int nElems;
    public Link first;

    public LinkedList() {
        nElems = 0;
        first = null;
    }

    public void insert(long dd) {
        Link newTemp = new Link(dd);

        if(nElems == 0)
            first = newTemp;

        else{

        }
    }
}
