package com.katreinhart;

public class Main {

    public static void main(String[] args) {
	    FirstLastList myList = new FirstLastList();

	    myList.insertFirst(22);
	    myList.insertFirst(44);
	    myList.insertFirst(66);

	    myList.insertLast(11);
	    myList.insertLast(33);
	    myList.insertLast(55);

	    myList.displayList();

	    myList.deleteFirst();
	    myList.deleteFirst();

	    myList.displayList();
    }
}
