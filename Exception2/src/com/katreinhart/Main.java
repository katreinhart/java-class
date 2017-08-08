package com.katreinhart;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kat on 8/8/17.
 */
public class Main {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide() {
        int x = getInt();
        int y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x/y;
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while(true) {
            try {
                return s.nextInt();
            } catch(InputMismatchException e) {
//                go around again, read past end of line in input first
                s.nextLine();
                System.out.println("Please enter a number using only digits 0 thru 9");
            }
        }
    }
}
