package com.katreinhart;

import java.util.ArrayList;

/**
 * Created by kat on 7/16/17.
 */
public class GroceryList {
    private ArrayList<String> myGroceryList = new ArrayList<String>();

    public void addItem(String item) {
        myGroceryList.add(item);
    }

    public void displayList() {
        System.out.println("You have " + myGroceryList.size() + " items on your list: ");
        for(int i=0; i<myGroceryList.size(); i++) {
            System.out.println(i+1 + ". " + myGroceryList.get(i));
        }
    }

    public String findItem(String searchItem) {
        int position = myGroceryList.indexOf(searchItem);

        if(position < 0)
            return null;
        else
            return myGroceryList.get(position);
    }

    public void replaceItem(int position, String newItem) {
        myGroceryList.set(position, newItem);
    }

    public void removeItem(int position) {
        String theItem = myGroceryList.get(position);
        myGroceryList.remove(position);
        System.out.println(theItem + " has been removed.");
    }
}
