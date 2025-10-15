package com.example.test.service;

import com.example.test.Dto.GroupDto;

import java.util.List;

public interface GroupService {
        List<GroupDto> getall();

        GroupDto getById(Long id);
        GroupDto save(GroupDto groupDto);
        GroupDto update(Long id, GroupDto groupDto);
        void delete(Long id);


}
