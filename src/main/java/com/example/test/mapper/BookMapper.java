package com.example.test.mapper;



import com.example.test.Dto.BookDto;
import com.example.test.models.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface BookMapper {
    BookDto toDto(Book book);
    Book toEntity(BookDto bookDto);
    List<Book> toEntityList(List<BookDto> bookDtoList);
    List<BookDto> toDtoList(List<Book> bookList);
}
