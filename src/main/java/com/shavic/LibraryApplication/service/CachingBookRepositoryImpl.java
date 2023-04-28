package com.shavic.LibraryApplication.service;

import com.shavic.LibraryApplication.model.Book;
import com.shavic.LibraryApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@Qualifier("2ndRepositoryImpl")
public class CachingBookRepositoryImpl implements BookRepository {

    @Override
    @Cacheable("Books")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "The New Book In Town!");
    }

    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
