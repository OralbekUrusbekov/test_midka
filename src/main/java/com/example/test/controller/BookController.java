package com.example.test.controller;

import com.example.test.Dto.BookDto;
import com.example.test.service.impl.BookServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("/book")
public class BookController {
    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl boolService) {
        this.bookService = boolService;
    }

    @GetMapping()
    public ResponseEntity<List<BookDto>> getAll(){
        return ResponseEntity.ok(bookService.getall());
    }

    @PostMapping()
    public ResponseEntity<BookDto> addbook(@RequestBody BookDto bookDto){
        return ResponseEntity.ok(bookService.save(bookDto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookDto> edit(@PathVariable Long id, @RequestBody BookDto bookDto){
        return ResponseEntity.ok(bookService.update(id,bookDto));
    }
}
