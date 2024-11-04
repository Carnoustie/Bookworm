package com.bookclub.bookworm;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    // You can define custom query methods here if needed
}
