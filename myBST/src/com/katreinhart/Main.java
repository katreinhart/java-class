package com.katreinhart;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
	    int value;
	    Tree theTree = new Tree();

	    theTree.insert(50, 1.5);
	    theTree.insert(25, 1.2);
	    theTree.insert(75, 1.7);
	    theTree.insert(12, 1.5);
	    theTree.insert(37, 1.2);
	    theTree.insert(43, 1.7);
	    theTree.insert(30, 1.5);
	    theTree.insert(33, 1.2);
	    theTree.insert(87, 1.7);
	    theTree.insert(93, 1.5);
	    theTree.insert(97, 1.5);

	    while(true){
	        s.nextLine();
            System.out.print("Enter first letter of show, insert, ");
            System.out.print("find, delete, rotate, or traverse: ");

            String input = s.nextLine();
            char choice = input.charAt(0);



            switch(choice) {
                case 's':
                    theTree.displayTree();
                    break;
                case 'i':
                    System.out.print("Enter value to insert: ");
                    value = s.nextInt();
                    s.reset();
                    theTree.insert(value, value +0.9);
                    break;
                case 'f':
                    System.out.print("Enter value to find: ");
                    System.out.flush();
                    value = s.nextInt();
                    Node found = theTree.find(value);
                    if(found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    }
                    else {
                        System.out.print("Could not find ");
                        System.out.print(value + "\n");
                    }
                    break;
                case 'd':
                    System.out.print("Enter value to delete: ");
//                    System.out.flush();
                    value = s.nextInt();
                    boolean didDelete = theTree.delete(value);
                    if(didDelete)
                        System.out.print("Deleted " + value + "\n");
                    else
                        System.out.println("Coudn not delete " + value + "\n");
                    break;

                case 'r':
                    System.out.print("Enter node to rotate about: ");
                    value = s.nextInt();

                    Node localRoot = theTree.find(value);
                    if(localRoot== null) {
                        System.out.print("Node not found.");
                        break;
                    }

                    System.out.println("Rotate (l)eft or (r)ight? ");
                    String localInput = s.nextLine();
                    choice = localInput.charAt(0);


                    switch(choice) {
                        case 'l':
                            theTree.rotateLeft(localRoot);
                            break;
                        case 'r':
                            theTree.rotateRight(localRoot);
                            break;
                        default:
                            System.out.print("Invalid input\n");
                            break;
                    }

                    break;
                case 't':
                    System.out.print("Enter type 1, 2, or 3: ");
//                    System.out.flush();
                    value = s.nextInt();
                    theTree.traverse(value);
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }

        }
    }
}
