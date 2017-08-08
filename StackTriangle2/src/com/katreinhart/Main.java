package com.katreinhart;

import java.util.Scanner;

public class Main {

    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        System.out.flush();
        theNumber = s.nextInt();
        stackTriangle();

        System.out.println("Triangle = " + theAnswer);
    }

    public static void stackTriangle() {
        theStack = new StackX(10000);

        theAnswer = 0;

        while(theNumber > 0) {
            theStack.push(theNumber--);
        }

        while(!theStack.isEmpty()) {
            int newN = theStack.pop();
            theAnswer += newN;
        }
    }


}
