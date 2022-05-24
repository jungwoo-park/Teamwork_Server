package com.example.demo.service;


import com.example.demo.dto.GroupDto;
import com.example.demo.mapper.GroupMapper;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GroupService {
    private final GroupMapper groupMapper;

    public GroupService(GroupMapper groupMapper) {
        this.groupMapper = groupMapper;
    }

    public List<GroupDto> getGroupList() {
        return groupMapper.getGroupList();
    }

    public GroupDto getGroupInfo(int id) {
        return groupMapper.getGroupInfo(id);
    }
}
