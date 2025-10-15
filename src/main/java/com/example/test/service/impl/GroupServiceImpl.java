    package com.example.test.service.impl;

    import com.example.test.Dto.GroupDto;
    import com.example.test.mapper.GroupMapper;
    import com.example.test.models.Group;
    import com.example.test.repositories.GroupRepositories;
    import com.example.test.service.GroupService;

    import java.util.List;

    public class GroupServiceImpl implements GroupService {
        private final GroupRepositories groupRepositories;
        private final GroupMapper groupMapper;

        public GroupServiceImpl(GroupRepositories groupRepositories, GroupMapper groupMapper) {
            this.groupRepositories = groupRepositories;
            this.groupMapper = groupMapper;
        }


        @Override
        public List<GroupDto> getall() {
            return groupMapper.toDtoList(groupRepositories.findAll());
        }

        @Override
        public GroupDto getById(Long id) {
            return groupMapper.toDto(groupRepositories.findById(id).orElse(null));
        }


        @Override
        public GroupDto save(GroupDto groupDto) {
            Group savedGroup = groupRepositories.save(groupMapper.toEntity(groupDto));
            return groupMapper.toDto(savedGroup);
        }

        @Override
        public GroupDto update(Long id, GroupDto groupDto) {
            Group group = groupRepositories.findById(id).orElse(null);
            if(group != null) {
                group.setName(groupDto.getName());
                group.setType(groupDto.getType());
                group.setStudents(groupMapper.toEntity(groupDto).getStudents());

                Group savebook = groupRepositories.save(group);
                return groupMapper.toDto(savebook);
            }
            return null;

        }

        @Override
        public void delete(Long id) {
            Group book = groupRepositories.findById(id).orElse(null);
            if(book != null){
                groupRepositories.delete(book);
            }

        }
    }
