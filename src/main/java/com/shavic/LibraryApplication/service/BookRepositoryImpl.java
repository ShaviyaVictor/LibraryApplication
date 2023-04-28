package com.shavic.LibraryApplication.service;

import com.shavic.LibraryApplication.model.Book;
import com.shavic.LibraryApplication.repository.BookRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class BookRepositoryImpl implements BookRepository {

    // Add the @Cachable annotation to cache the data to the books cache named 'books'
    @Override
    @Cacheable("books")
    public Book getByIsbn(String isbn) {
//        a method that deliberately inserts a 3-sec delay into each method call
        simulateSlowService();
        return new Book(isbn,"Sample Book");
    }

//    simulating some latency(network service or just some issue & in our case slow delay)
//    and calling it in the method implementation for a 3-sec delay
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

}
