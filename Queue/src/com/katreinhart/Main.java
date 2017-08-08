package com.katreinhart;

public class Main {

    public static void main(String[] args) {
	    NoCountQueue myQueue = new NoCountQueue(5);

	    myQueue.insert(10);
	    myQueue.insert(20);
	    myQueue.insert(30);
	    myQueue.insert(40);

	    myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        myQueue.insert(50);
        myQueue.insert(60);
        myQueue.insert(70);
        myQueue.insert(80);

        while(!myQueue.isEmpty()) {
            long n = myQueue.remove();
            System.out.println(n);

        }

    }
}
