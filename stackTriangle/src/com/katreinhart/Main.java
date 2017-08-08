package com.katreinhart;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static int theNumber;
    static int theAnswer;
    static StackX theStack;
    static int codePart;
    static Params theseParams;

    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        System.out.flush();
        theNumber = s.nextInt();

        recTriangle();

        System.out.println("Triangle = " + theAnswer);
    }

    public static void recTriangle() {
        theStack = new StackX(10000);
        codePart = 1;
        while(step() == false)
            ;
    }

    public static boolean step() {
        switch(codePart) {
            case 1:
                theseParams = new Params(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:
                theseParams = theStack.peek();
                if(theseParams.n == 1){
                    theAnswer = 1;
                    codePart = 5;
                }
                else
                    codePart = 3;
                break;
            case 3:
                Params newParams = new Params(theseParams.n - 1, 4);
                theStack.push(newParams) ;
                codePart = 2;
                break;
            case 4:
                theseParams = theStack.peek();
                theAnswer += theseParams.n;
                codePart = 5;
                break;
            case 5:
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;
        }

        return false;
    }
}
