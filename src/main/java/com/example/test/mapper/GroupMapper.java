package com.example.test.mapper;


import com.example.test.Dto.GroupDto;
import com.example.test.models.Group;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring",uses={GroupMapper.class})
public interface GroupMapper {
    GroupDto toDto(Group group);
    Group toEntity(GroupDto groupDto);
    List<Group> toEntityList(List<GroupDto> groupDtoList);
    List<GroupDto> toDtoList(List<Group> groupList);
}
