package com.katreinhart;

/**
 * Created by kat on 8/7/17.
 */
public class Node {

    public int iData;
    public double dData;

    public Node leftChild;
    public Node rightChild;

    public Node parent;

    public void displayNode() {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

}
