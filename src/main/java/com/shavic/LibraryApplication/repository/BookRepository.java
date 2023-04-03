package com.shavic.LibraryApplication.repository;

import com.shavic.LibraryApplication.model.Book;

public interface BookRepository {

//    get method
    Book getByIsbn(String isbn);

}
