package com.katreinhart;

public class Main {

    public static void main(String[] args) {
	    int maxSize = 100;
	    ordArray arr = new ordArray(maxSize);

	    arr.insert(72);
	    arr.insert(234);
	    arr.insert(332);
	    arr.insert(47);
	    arr.insert(123);
	    arr.insert(4);
	    arr.insert(77);
	    arr.insert(25);
	    arr.insert(98);
	    arr.insert(78);

	    arr.display();

	    int searchKey = 47;
	    if(arr.find(searchKey) != arr.size())
            System.out.println("Found " + searchKey);
	    else
            System.out.println("Can't find " + searchKey);
    }
}
