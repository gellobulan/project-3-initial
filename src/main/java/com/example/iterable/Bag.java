package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;

public class Bag<T> implements Container<T> {

    private ArrayList<T> items;  // Use ArrayList as the backing storage

    public Bag() {
        items = new ArrayList<>();  // Initialize the ArrayList
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();  // Delegate to ArrayList's isEmpty method
    }

    @Override
    public int size() {
        return items.size();  // Delegate to ArrayList's size method
    }

    @Override
    public void add(T item) {
        items.add(item);  // Add item to the ArrayList
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();  // Return an iterator for the ArrayList
    }
}