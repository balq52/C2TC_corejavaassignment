package com.sreeja.assignment3;

import com.sreeja.assignment3.*;

public class Main {
    public static void main(String[] args) {
        // Part A – Inheritance (is-a)
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magzine mag1 = new Magzine(201, "Tech Today", 45);

        book1.displayInfo();
        mag1.displayInfo();

        // Part B – Composition (has-a)
        Library lib = new Library();
        lib.addItem(book1);
        lib.addItem(mag1);

        lib.showAllItems();
    }
}
