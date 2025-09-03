package com.sreeja.assignment3;

public class Magzine extends Item {
    private int issueNumber;

    public Magzine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine [ID: " + getId() + ", Title: " + getTitle() +
                           ", Issue: " + issueNumber + "]");
    }

    public int getIssueNumber() { return issueNumber; }
}
