package com.shavic.LibraryApplication;

import com.shavic.LibraryApplication.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//create the AppRunner class which implements the CommandLineRunner
// that injects the BookRepository and calls it different several times with different arguments
@Component
public class AppRunner implements CommandLineRunner {

    public static final Logger logger = LoggerFactory.getLogger(AppRunner.class);
    private final BookRepository bookRepository;

    @Autowired // injecting the necessary service to the main class calling the repository being implemented
    //    Below we are using the @Qualifier annotation to call the service bean that we expect to be called in this running class
    public AppRunner(@Qualifier("2ndRepositoryImpl") BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //  arguments to be printed on the terminal
        logger.info("...Fetching books");
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-5678 -->" + bookRepository.getByIsbn("isbn-5678"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-5678 -->" + bookRepository.getByIsbn("isbn-5678"));
        logger.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
        logger.info("isbn-5678 -->" + bookRepository.getByIsbn("isbn-5678"));

    }
}
