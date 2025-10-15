package com.example.test.service;

import com.example.test.Dto.BookDto;
import com.example.test.models.Book;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {
    List<BookDto> getall();
    BookDto getById(Long id);
    BookDto save(BookDto bookDto);
    BookDto update(Long id, BookDto bookDto);
    void delete(Long id);
}
