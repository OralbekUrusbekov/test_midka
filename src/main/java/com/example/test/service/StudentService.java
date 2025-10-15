package com.example.test.service;

import com.example.test.Dto.StudentDto;

public interface StudentService {
    StudentDto getById(Integer id);
    void save(StudentDto studentDto);
    void update(Long id, StudentDto studentDto);
    void delete(Long id);
}
