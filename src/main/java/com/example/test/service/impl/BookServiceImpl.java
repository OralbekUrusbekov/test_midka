package com.example.test.service.impl;

import com.example.test.Dto.BookDto;
import com.example.test.mapper.BookMapper;
import com.example.test.models.Book;
import com.example.test.repositories.BookRepositories;
import com.example.test.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepositories bookRepositories;
    private final BookMapper bookMapper;

    public BookServiceImpl(BookRepositories bookRepositories, BookMapper bookMapper) {
        this.bookRepositories = bookRepositories;
        this.bookMapper = bookMapper;
    }


    @Override
    public List<BookDto> getall() {
        return bookMapper.toDtoList(bookRepositories.findAll());
    }

    @Override
    public BookDto getById(Long id) {
        return bookMapper.toDto(bookRepositories.findById(id).orElse(null));
    }

    @Override
    public BookDto save(BookDto bookDto) {
        Book savedBook = bookRepositories.save(bookMapper.toEntity(bookDto));
        return bookMapper.toDto(savedBook);
    }

    @Override
    public BookDto update(Long id, BookDto bookDto) {
        Book book = bookRepositories.findById(id).orElse(null);
        if(book != null) {
            book.setGenre(bookDto.getGenre());
            book.setName(bookDto.getName());

        Book savebook = bookRepositories.save(book);
        return bookMapper.toDto(savebook);
        }
        return null;

    }

    @Override
    public void delete(Long id) {
        Book book = bookRepositories.findById(id).orElse(null);
        if(book != null){
            bookRepositories.delete(book);
        }

    }
}
