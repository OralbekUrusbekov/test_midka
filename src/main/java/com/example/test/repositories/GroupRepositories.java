package com.example.test.repositories;

import com.example.test.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepositories extends JpaRepository<Group, Long> {
}
