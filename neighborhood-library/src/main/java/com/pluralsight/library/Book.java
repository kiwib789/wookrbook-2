package com.pluralsight.library;
import java.util.Scanner;


public class Book {
    // variables
    Scanner scanner = new Scanner(System.in);
    private String isbn;
    private int id;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String title, String isbn, boolean isCheckedOut, String checkedOutTo) {

        this.isbn = isbn;
        this.id = id;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;


    }

    public Book(int id, String title, String isbn, boolean isCheckedOut) {
    }

// getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheckedOut(String userId, String book) {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
    public String toString(){
        return "ID: " + id + "Title: " + title + "ISBN: " + isbn + "Checked out: " + isCheckedOut + "Checked out to: "+ checkedOutTo;
    }

    public void returnBook(String userId, String book) {
    }

    public void viewCatalog() {
    }

    public void menu() {
    }

    public class bookTracker extends Book {
        public bookTracker(int id, String title, String isbn, boolean isCheckedOut, String checkedOutTo) {
            super(id, title, isbn, isCheckedOut, checkedOutTo);
        }
    }
}
