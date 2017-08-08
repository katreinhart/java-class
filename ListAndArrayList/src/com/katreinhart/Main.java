package com.katreinhart;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
	    GroceryList myList = new GroceryList();

        System.out.print("Please enter the number of items on your list: ");
        int number = s.nextInt();
        s.nextLine();

        for(int i=0; i<number; i++) {
            System.out.print("Enter Item " + (int)(i+1) + ": ");
            String nextItem = s.nextLine();
            myList.addItem(nextItem);
        }

        myList.displayList();

    }
}
