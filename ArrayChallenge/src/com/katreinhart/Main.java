package com.katreinhart;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        displayIntegers(myIntegers);
        int[] mySortedIntegers = sortIntegers(myIntegers);
        displayIntegers(mySortedIntegers);
    }

    private static int[] getIntegers(int n) {

        int[] temp = new int[n];
        System.out.println("Please enter " + n + " integers, separated by return key: ");
        System.out.flush();
        for(int i=0; i<n; i++) {
            temp[i] = scanner.nextInt();
        }
        return temp;
    }

    private static int[] bubbleSortIntegers(int[] arr) {

        int[] sortedArray = new int[arr.length];
        for(int j=0; j<arr.length; j++) {
            sortedArray[j] = arr[j];
        }

        for(int i=0; i < sortedArray.length; i++) {
            for(int j=i; j<sortedArray.length; j++) {
                if(sortedArray[j] > sortedArray[i]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        return sortedArray;
    }

    private static int[] sortIntegers(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for(int j=0; j< arr.length; j++) {
            sortedArr[j] = arr[j];
        }

        boolean flag = true;
        int temp;

        System.out.println("Begin sort");
        while(flag) {
            System.out.println("Entering while loop");
            displayIntegers(sortedArr);
            flag = false;
            for(int i=0; i<sortedArr.length-1; i++) {
                System.out.println("Inside for loop, i = " + i);
                if(sortedArr[i] < sortedArr[i+1]) {
                    System.out.println("Trigger sort case");
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag=true;
                    System.out.println("Array is now: ");
                    displayIntegers(sortedArr);
                }

            }
        }

        return sortedArr;
    }



    private static void insertionSortIntegers(int[] arr) {

    }

    private static void displayIntegers(int[] arr) {
        System.out.print("Array is: ");
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println("");
    }
}
