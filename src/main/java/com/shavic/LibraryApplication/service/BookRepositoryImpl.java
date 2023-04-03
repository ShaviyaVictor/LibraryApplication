package com.shavic.LibraryApplication.service;

import com.shavic.LibraryApplication.model.Book;
import com.shavic.LibraryApplication.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public Book getByIsbn(String isbn) {
        return new Book(isbn,"Sample Book");
    }

}
