package com.shavic.LibraryApplication;

import com.shavic.LibraryApplication.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//create the AppRunner class which implements the CommandLineRunner
// that injects the BookRepository and calls it different several times with different arguments
@Component
public class AppRunner implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final BookRepository bookRepository;


    public AppRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info("...Fetching books");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));

    }
}
