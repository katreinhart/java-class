package com.katreinhart;

public class Main {

    public static void main(String[] args) {
	    LinkList myList = new LinkList();

	    myList.insertFirst(22, 2.99);
	    myList.insertFirst(44, 4.99);
	    myList.insertFirst(66, 6.99);
	    myList.insertFirst(88, 8.99);

	    myList.displayList();

	    Link f = myList.find(44);

	    if(f!= null)
			System.out.println("Found link with key " + f.iData);
	    else
			System.out.println("Can't find link");

	    Link d = myList.delete(66);
	    if(d!= null)
			System.out.println("Deleted link with key " + d.iData);
	    else
			System.out.println("Can't delete link");

        myList.displayList();
    }
}
