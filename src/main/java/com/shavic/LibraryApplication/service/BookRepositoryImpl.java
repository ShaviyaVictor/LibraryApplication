package com.shavic.LibraryApplication.service;

import com.shavic.LibraryApplication.model.Book;
import com.shavic.LibraryApplication.repository.BookRepository;

public class BookRepositoryImpl implements BookRepository {

    @Override
    public Book getByIsbn(String isbn) {
        return new Book(isbn,"Sample Book");
    }

//    simulating some latency(network service or just some issue & in our case slow delay)
//    and calling it in the method implementation
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
