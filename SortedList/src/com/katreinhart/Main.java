package com.katreinhart;

public class Main {

    public static void main(String[] args) {
	    SortedList theList = new SortedList();
	    theList.insert(99);
	    theList.insert(55);
	    theList.insert(22);

	    theList.displayList();

	    theList.insert(10 );
	    theList.insert(44);
	    theList.displayList();

	    theList.remove();

	    theList.displayList();
    }
}
