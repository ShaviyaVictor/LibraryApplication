package com.shavic.LibraryApplication.service;

import com.shavic.LibraryApplication.model.Book;
import com.shavic.LibraryApplication.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class CachingBookRepositoryImpl implements BookRepository {

    @Override
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "The New Book In Town!");
    }

    private void simulateSlowService() {
        try{
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
