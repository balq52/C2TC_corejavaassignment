package com.sreeja.assignment3;

import java.util.ArrayList;
import java.util.List;

import com.sreeja.assignment3.Item;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof com.sreeja.assignment3.Book book) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            } else if (item instanceof com.sreeja.assignment3.Magzine magzine) {
                System.out.println("- " + magzine.getTitle() + " Issue " + magzine.getIssueNumber());
            } else {
                System.out.println("- " + item.getTitle());
            }
        }
    }
}

