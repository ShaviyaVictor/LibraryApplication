package com.shavic.LibraryApplication.model;

public class Book {

    private String isbn;
    private String title;

//    create the model's constructors
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

//    create the constructor's getters and setters
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
