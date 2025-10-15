package com.example.test.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="groups")
public class Group {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;

    @ManyToMany()
    @JoinTable(name="student_group",
    joinColumns = @JoinColumn(name="group_id"),
            inverseJoinColumns = @JoinColumn(name="student_id")
    )
    private List<Student> students;

}
