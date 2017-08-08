package com.katreinhart;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Factorial Program");
        System.out.print("Please enter an integer: ");
        int n = s.nextInt();
        s.nextLine();

        System.out.println(n + " factorial is: " + factorial(n));

    }

    public static long factorial(int n) {
        if(n == 0)
            return 1;
        return n * (factorial(n-1));
    }
}
