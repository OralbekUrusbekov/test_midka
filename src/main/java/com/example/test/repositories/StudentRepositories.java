package com.example.test.repositories;

import com.example.test.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositories extends JpaRepository<Student,Long> {

}
