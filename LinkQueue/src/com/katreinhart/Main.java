package com.katreinhart;

// Implementing a queue using a linked list is advantageous if you do not know the maximum number of elements

public class Main {

    public static void main(String[] args) {
	    LinkQueue theQueue = new LinkQueue();
	    theQueue.insert(20);
	    theQueue.insert(40);
	    theQueue.displayQueue();

	    theQueue.insert(50);
	    theQueue.insert(80);

	    theQueue.displayQueue();

	    theQueue.remove();
	    theQueue.remove();

	    theQueue.displayQueue();
    }
}
