package com.katreinhart;

import java.util.Scanner;

public class Main {

    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
	    LinkList theList = new LinkList();
	    ListIterator iter1 = theList.getIterator();
	    long value;

	    iter1.insertAfter(20);
	    iter1.insertAfter(40);
	    iter1.insertAfter(80);
	    iter1.insertBefore(60);

	    while(true){
            System.out.print("Enter number for: (1) show, (2) reset, (3) next, ");
            System.out.print("(4) get, (5) before, (6) after, (7) delete, (8) quit: ");
            System.out.flush();

            int choice = (int)myScanner.nextInt();

            switch(choice) {
                case 1:
                    if(!theList.isEmpty())
                        theList.displayList();
                    else
                        System.out.println("The list is empty.");
                    break;
                case 2:
                    iter1.reset();
                    break;
                case 3:
                    if(!theList.isEmpty() && !iter1.atEnd())
                        iter1.nextLink();
                    else
                        System.out.println("Can't go to next link");
                    break;
                case 4:
                    if(!theList.isEmpty()){
                        value = iter1.getCurrent().dData;
                        System.out.println("Returned " + value);
                    }
                    else
                        System.out.println("List is empty");
                    break;
                case 5:
                    System.out.print("Enter value to insert: ");
                    System.out.flush();
                    value = myScanner.nextInt();
                    iter1.insertBefore(value);
                    break;
                case 6:
                    System.out.println("Enter value to insert: ");
                    System.out.flush();
                    value = myScanner.nextInt();
                    iter1.insertAfter(value);
                    break;
                case 7:
                    if(!theList.isEmpty()) {
                        value = iter1.deleteCurrent();
                        System.out.println("Deleted " + value);
                    }
                    else
                        System.out.println("Can't delete");
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}
