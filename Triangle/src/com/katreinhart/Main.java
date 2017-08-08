package com.katreinhart;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int theNumber;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        theNumber = s.nextInt();
        s.nextLine();

        int theAnswer = triangle(theNumber);
        System.out.println("The " + theNumber + "th triangular number is " + theAnswer);
        printTriangle(theNumber);
    }

    public static int triangle(int n) {
        if(n == 1)
            return n;
        return n + triangle(n-1);
    }

    public static void printTriangle(int n) {
        for(int j=n; j>0; j--) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }

}
