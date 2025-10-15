package com.example.test.controller;

import com.example.test.Dto.BookDto;
import com.example.test.Dto.GroupDto;
import com.example.test.service.GroupService;
import com.example.test.service.impl.BookServiceImpl;
import com.example.test.service.impl.GroupServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GroupController {

    private final GroupServiceImpl groupService;

    public GroupController(GroupServiceImpl groupService) {
        this.groupService = groupService;
    }

    @GetMapping()
    public ResponseEntity<List<GroupDto>> getAll(){
        return ResponseEntity.ok(groupService.getall());
    }

    @PostMapping()
    public ResponseEntity<String> addbook(@RequestBody GroupDto groupDto){
        return ResponseEntity.ok(groupService.save(groupDto).getName());
    }

    @PutMapping("/{id}")
    public ResponseEntity<GroupDto> edit(@PathVariable Long id, @RequestBody GroupDto groupDto){
        return ResponseEntity.ok(groupService.update(id,groupDto));
    }

}
