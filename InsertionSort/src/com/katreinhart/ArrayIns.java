package com.katreinhart;

/**
 * Created by kat on 7/17/17.
 */
public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems++] = value;
    }

    public void display() {
        for(int j=0; j<nElems; j++) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void insertionSort() {
        int in, out;

        for(out = 1; out < nElems; out++) {
            long temp = a[out];
            in = out;
            while(in > 0 && a[in-1] >= temp) {
                a[in] = a[in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    public long median() {
        int indexOf = nElems/2;
        return a[indexOf];
    }
}
