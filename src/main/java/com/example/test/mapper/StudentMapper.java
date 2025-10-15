package com.example.test.mapper;

import com.example.test.Dto.StudentDto;
import com.example.test.models.Student;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper(componentModel="string",uses = {BookMapper.class, GroupMapper.class,})
public interface StudentMapper {
    StudentDto toDto(Student student);
    Student toEntity(StudentDto studentDto);
    List<Student> toEntityList(List<StudentDto> studentDtoList);
    List<StudentDto> toDtoList(List<Student> students);
}
