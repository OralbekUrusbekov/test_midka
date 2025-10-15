package com.example.test.repositories;

import com.example.test.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositories extends JpaRepository<Book, Long> {

}
