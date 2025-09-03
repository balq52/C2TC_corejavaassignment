package com.sreeja.assignment3;

public class Item {
    private int id;
    private String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void displayInfo() {
        System.out.println("Item [ID: " + id + ", Title: " + title + "]");
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
}