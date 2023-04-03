package com.shavic.LibraryApplication.repository;

import com.shavic.LibraryApplication.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
