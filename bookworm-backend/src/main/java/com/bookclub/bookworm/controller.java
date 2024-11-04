package com.bookclub.bookworm;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bookclub.bookworm.Book;
import com.bookclub.bookworm.BookRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private BookRepository bookRepository;  // Inject the BookRepository
    
    @GetMapping("/bookworm")
    public List<Book> getMethodName() {
        // Create a new Book object
        Book book = new Book("Brave New World", "Aldous Huxley");

        // Save the book to the database
        bookRepository.save(book);

        List<Book> mybooks = StreamSupport.stream(bookRepository.findAll().spliterator(), false).collect(Collectors.toList());
        // return new String("\n\nWelcome to my Book Club!\n\n");
        // Book b = mybooks.get()0);
        return mybooks;

    }
    
}
